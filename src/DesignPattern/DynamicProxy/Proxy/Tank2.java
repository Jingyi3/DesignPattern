package DesignPattern.DynamicProxy.Proxy;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Tank2 extends Tank {
    @Override
    public void move() {
        long start = System.currentTimeMillis();

        super.move();

        long end = System.currentTimeMillis();
        System.out.println("run time: " + (start - end));
    }
}
