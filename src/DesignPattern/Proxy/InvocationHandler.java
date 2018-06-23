package DesignPattern.Proxy;

import java.lang.reflect.Method;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public interface InvocationHandler {
    public void invoke(Object o, Method m);
}
