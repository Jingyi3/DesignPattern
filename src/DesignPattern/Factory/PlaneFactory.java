package DesignPattern.Factory;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class PlaneFactory extends VechileFactory {
    public Movable create(){
        return new Plane();
    }
}
