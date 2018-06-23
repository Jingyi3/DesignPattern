package DesignPattern.Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Car implements  Movable{
    private static Car car = new Car();
    private static List<Car> cars = new ArrayList<>();

    public Car() {
    }

    public static Car getInstance() {
        //Car自己能够控制newCar了
        //if...进行限制
        return car;
    }

    public void run() {
        System.out.println("冒着烟，奔跑中car...");
    }
}
