package bitcamp.pms;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bitcamp.pms.context.ApplicationContext;
import bitcamp.pms.context.request.RequestHandler;
import bitcamp.pms.context.request.RequestHandlerMapping;
import bitcamp.pms.controller.AuthController;
import bitcamp.pms.util.Session;

public class ProjectApp {
  Scanner keyScan = new Scanner(System.in);
  ApplicationContext appContext;
  RequestHandlerMapping requestHandlerMapping;
  Session session = new Session();
  
  public static void main(String[] args) {
    ProjectApp projectApp = new ProjectApp();
    projectApp.run();
  }
  
  public ProjectApp() {
    appContext = new ApplicationContext("bitcamp.pms");
    requestHandlerMapping = new RequestHandlerMapping(appContext);
    appContext.addBean("stdin", keyScan);
    appContext.addBean("session", session);
    try {
      appContext.addBean("sqlSessionFactory", new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("conf/mybatis-config.xml")));
    } catch (Exception e) {
      System.out.println("mybatis 준비 중 오류 발생!\n시스템을 종료하겠습니다.");
      e.printStackTrace();
      return;
    }
  }
  
  public void run() {
    AuthController auth = (AuthController) appContext.getBean(AuthController.class);
    String input;
    do {
      auth.setCheckNum(0);
      auth.service();
      while (auth.getCheckNum() == 0) {
        input = prompt();
        processCommand(input);
      }
    } while (auth.getCheckNum() == 1);
  }
  
  private void processCommand(String input) {
    switch (input) {
    case "about":
      doAbout();
      break;
    case "quit":
      doQuit();
      System.exit(-1);
    default:
      RequestHandler requestHandler = (RequestHandler) requestHandlerMapping.getRequestHandler(input);
      if (requestHandler == null) {
        doError();
        return ;
      }
       
      Method method = requestHandler.getMethod();
      Object obj = requestHandler.getInstance();
      
      try {
        ArrayList<Object> args = new ArrayList<>();

        for (Parameter param : method.getParameters()) {
          args.add(appContext.getBean(param.getType()));
        }

        method.invoke(obj, args.toArray());
      } catch (Exception e) {
        System.out.println("명령처리중에 오류가 발생했습니다.");
        e.printStackTrace();
      }
    }
  }

  private String prompt() {
    System.out.print("명령> ");
    return keyScan.nextLine().toLowerCase();
  }

  private void doQuit() {
    System.out.println("안녕히가세요");
  }

  private void doError() {
    System.out.println("잘못된 명령어입니다.");
  }

  static void doAbout() {
    System.out.println("자바 80기 프로젝트");
  }

}