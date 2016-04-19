package bitcamp.pms.context.request;

import java.lang.reflect.Method;
import java.util.HashMap;

import bitcamp.pms.annotation.Controller;
import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.context.ApplicationContext;

public class RequestHandlerMapping {
  HashMap<String, RequestHandler> handlerMap = new HashMap<>();
  
  public RequestHandlerMapping(ApplicationContext appContext) {
    super();
    
    RequestMapping anno = null;
    String baseName = null;
    for (Object controller : appContext.getBeansWithAnnotation(Controller.class).values()) {
      if (controller.getClass().getAnnotation(RequestMapping.class) != null) {
        baseName = controller.getClass().getAnnotation(RequestMapping.class).value();
      } else {
        baseName = "";
      }
      
      for (Method method : controller.getClass().getMethods()) {
        anno = method.getAnnotation(RequestMapping.class);       
        
        if (anno == null) 
          continue;
        
        handlerMap.put(baseName + anno.value(), new RequestHandler(method, controller));
      }
    }
  }

  public RequestHandler getRequestHandler(String name) {
    return handlerMap.get(name);
  }
}
