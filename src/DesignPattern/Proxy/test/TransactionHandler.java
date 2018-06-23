package DesignPattern.Proxy.test;

import DesignPattern.Proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class TransactionHandler implements InvocationHandler {
    private Object target;

    public TransactionHandler(Object target) {
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method m) {
        System.out.println("Transaction start");

        try {
            m.invoke(target);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Transaction Commit");

    }
}
