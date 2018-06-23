package DesignPattern.Proxy.test;

import java.net.URLClassLoader;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class UserMgrImpl implements UserMgr {

    @Override
    public void addUser() {
        System.out.println("1. 插入记录到user表");
        System.out.println("2. 做日志在另外一张表");
    }
}
