package DesignPattern.Factory;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Test {

    public static void main(String[] args) {
        VechileFactory factory = new BroomFactory();
        Movable m = factory.create();
        m.run();
    }
}
