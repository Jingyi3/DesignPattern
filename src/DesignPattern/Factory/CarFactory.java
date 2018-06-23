package DesignPattern.Factory;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class CarFactory extends VechileFactory{

    @Override
    Movable create() {
        return new Car();

    }
}
