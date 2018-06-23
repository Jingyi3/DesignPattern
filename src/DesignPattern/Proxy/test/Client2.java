package DesignPattern.Proxy.test;

import DesignPattern.Proxy.InvocationHandler;
import DesignPattern.Proxy.Proxy;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Client2 {
    public static void main(String[] args) throws Exception{
        UserMgr mgr = new UserMgrImpl();
        InvocationHandler h = new TransactionHandler(mgr);
        UserMgr u = (UserMgr) Proxy.newProxyInstance(UserMgr.class, h);
        u.addUser();

    }
}
