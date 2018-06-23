package DesignPattern.compiler.test;

import java.lang.reflect.Method;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Test2 {

    public static void main(String[] args) {
        Method[] methods = DesignPattern.Proxy.Movable.class.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}
