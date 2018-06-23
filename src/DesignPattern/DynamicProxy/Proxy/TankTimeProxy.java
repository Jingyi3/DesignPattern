package DesignPattern.DynamicProxy.Proxy;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class TankTimeProxy implements Movable {
    public TankTimeProxy(Movable tank) {
        this.tank = tank;
    }

    Movable tank;

    @Override
    public void move() {
        //日志记录，权限，事务etc
        long start = System.currentTimeMillis();
        System.out.println("start time: "+ start);

        tank.move();

        long end = System.currentTimeMillis();
        System.out.println("run time: " + (end - start));
    }
}
