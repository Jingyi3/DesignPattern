package DesignPattern.Proxy;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Client {
    public static void main(String[] args) throws Exception{

        Tank t = new Tank();
        InvocationHandler th = new TimeHandler(t);
        Movable m  = (Movable) Proxy.newProxyInstance(Movable.class,th);
        m.move();
    }
}
