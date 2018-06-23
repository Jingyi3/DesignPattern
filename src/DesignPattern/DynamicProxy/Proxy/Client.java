package DesignPattern.DynamicProxy.Proxy;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Client {
    public static void main(String[] args) {

        Tank t = new Tank();
//        TankTimeProxy ttp = new TankTimeProxy(t);//生成了对于t的代理对象
//        TankLogProxy tlp = new TankLogProxy(ttp);//在ttp（t的时间代理）外面包了一层日志代理
//        Movable m = tlp;
        TankLogProxy tlp = new TankLogProxy(t);
        TankTimeProxy ttp = new TankTimeProxy(tlp);
        Movable m = ttp;
        m.move();
    }
}
