package DesignPattern.Factory;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class BroomFactory extends VechileFactory {
    @Override
    Movable create() {
        return new Broom();
    }
}
