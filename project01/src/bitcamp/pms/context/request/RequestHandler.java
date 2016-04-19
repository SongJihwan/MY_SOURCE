package bitcamp.pms.context.request;

import java.lang.reflect.Method;

public class RequestHandler {
  Method method;
  Object instance;
  
  public RequestHandler() {}

  public RequestHandler(Method method, Object instance) {
    super();
    this.method = method;
    this.instance = instance;
  }

  public Object getInstance() {
    return instance;
  }

  public void setInstance(Object instance) {
    this.instance = instance;
  }

  public Method getMethod() {
    return method;
  }

  public void setMethod(Method method) {
    this.method = method;
  }
}
