package DesignPattern.Proxy;

import java.util.Random;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("Tank moving...");
        try {
            Thread.sleep(new Random().nextInt(10000));
            //产生10000以内的一个随机数
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
