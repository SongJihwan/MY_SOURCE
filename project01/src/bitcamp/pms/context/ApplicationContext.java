package bitcamp.pms.context;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bitcamp.pms.annotation.Component;
import bitcamp.pms.annotation.Controller;

public class ApplicationContext {
  HashMap<String, Object> objPool = new HashMap<>();

  public ApplicationContext(String basePackage) {
    String path = "./bin/" + basePackage.replace(".", "/");
    createObject(new File(path));
    injectDependency();
  }

  private void injectDependency() {
    Object dependency = null;
    for (Object object : objPool.values()) {
      if (!object.getClass().isAnnotationPresent(Component.class) 
          && !object.getClass().isAnnotationPresent(Controller.class)) 
        continue;
      
      for (Method method : object.getClass().getMethods()) {
        if (!method.getName().startsWith("set"))
          continue;

        dependency = getBean(method.getParameterTypes()[0]);
        
        if (dependency == null)
          continue;
        
        try {
          method.invoke(object, dependency);
        } catch (Exception e) {}
      }
    }
  }


  private void createObject(File file) {
    if (file.isFile() && file.getName().endsWith(".class")) {
      try {
        Class<?> clazz = Class.forName(file.getPath().replace("./bin/", "").replace(".class", "").replace("/", "."));
        
        if (clazz.getAnnotation(Component.class) != null) {
          processComponentAnnotation(clazz);
        } else if (clazz.getAnnotation(Controller.class) != null) {
          processContorllerAnnotation(clazz);
        }
        
      } catch (Exception e) {
        e.printStackTrace();
      }
      return;
    }

    if (!file.isDirectory())
      return;
    
    for (File subfile : file.listFiles()) {
      createObject(subfile);
    }
  }

  private void processContorllerAnnotation(Class<?> clazz) throws Exception {
    Controller anno = clazz.getAnnotation(Controller.class);
    if (!anno.value().equals("")) 
      return ;

    objPool.put(clazz.getName(), clazz.newInstance());
  }

  private void processComponentAnnotation(Class<?> clazz) throws Exception {
    Component anno = clazz.getAnnotation(Component.class);
    if (!anno.value().equals(""))
      return  ;
      
    objPool.put(clazz.getName(), clazz.newInstance());
  }

  public List<Object> getBeans(Class<?> beanType) {
    ArrayList<Object> list = new ArrayList<>();

    for (Object object : objPool.values()) {
      if (beanType.isInstance(object)) {
        list.add(object);
      }
    }

    return list;
  }

  public Object getBean(String name) {
    return objPool.get(name);
  }

  public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annoType) {
    Object obj = null;
    HashMap<String, Object> objMap = new HashMap<>();

    for (Entry<String, Object> entry : objPool.entrySet()) {
      obj = entry.getValue();
      if (obj.getClass().getAnnotation(annoType) == null)
        continue;

      objMap.put(entry.getKey(), obj);
    }

    return objMap;
  }

  public Object getBean(Class<?> beanType) {
    for (Object object : objPool.values()) {
      if (beanType.isInstance(object)) {
        return object;
      }
    }
    return null;
  }

  public void addBean(String name, Object bean) {
    objPool.put(name, bean);
    injectDependency();
  }
}
