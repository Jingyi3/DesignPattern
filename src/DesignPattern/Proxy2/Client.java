package DesignPattern.Proxy2;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Client {
    public static void main(String[] args) {

        Tank t = new Tank();
        Movable m  = (Movable) Proxy.newProxyInstance(Movable.class);
        m.move();
    }
}
