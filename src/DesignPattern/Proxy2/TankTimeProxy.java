package DesignPattern.Proxy2;

public class TankTimeProxy implements Movable {
public TankTimeProxy(Movable tank) {
this.tank = tank;
}
Movable tank;
@Override
public void move() {
long start = System.currentTimeMillis();
System.out.println("start time: "+ start);
tank.move();
long end = System.currentTimeMillis();
System.out.println("run time: " + (end - start));
}
}