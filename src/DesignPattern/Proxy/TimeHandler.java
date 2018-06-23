package DesignPattern.Proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class TimeHandler implements InvocationHandler {
    private Object t;//被代理对象

    public TimeHandler(Object t) {
        this.t = t;
    }

    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }

    @Override
    public void invoke(Object o, Method m) {
        long start = System.currentTimeMillis();
        System.out.println("start time: " + start);

        try {
            m.invoke(t);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("run time: " + (end - start));
    }
}
