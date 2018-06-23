package DesignPattern.Proxy;
import java.lang.reflect.Method;
public class TankTimeProxy implements DesignPattern.Proxy.test.UserMgr {
public TankTimeProxy(InvocationHandler h) {
this.h = h;
}
InvocationHandler h;
@Override
public void addUser(){
try{
Method md = DesignPattern.Proxy.test.UserMgr.class.getMethod("addUser");
h.invoke(this,md);
}catch(Exception e){
e.printStackTrace();}
}}