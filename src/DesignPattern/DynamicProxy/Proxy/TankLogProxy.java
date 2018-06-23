package DesignPattern.DynamicProxy.Proxy;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class TankLogProxy implements Movable {
    public TankLogProxy(Movable tank) {
        this.tank = tank;
    }

    Movable tank;

    @Override
    public void move() {
        //日志记录，权限，事务etc
        System.out.println("Tank start...");

        tank.move();

        System.out.println("Tank stop...");

    }
}
