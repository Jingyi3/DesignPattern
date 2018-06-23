package DesignPattern.Proxy2;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Proxy {
    public static Object newProxyInstance(Class interf) {
        //实现动态编译 compilerAPI，CDlibrary 生成二进制文件，ASM
        String src =
        "package DesignPattern.Proxy;"+
        "public class TankTimeProxy implements Movable {"+
            "public TankTimeProxy(Movable tank) {"+
                "this.tank = tank;"+
            "}"+

            "Movable tank;"+


            "@Override"+
            "public void move() {"+
                "long start = System.currentTimeMillis();"+
                "System.out.println(\"start time: \"+ start);"+

                "tank.move();"+

                "long end = System.currentTimeMillis();"+
                "System.out.println(\"run time: \" + (end - start));"+
            "}"+

        "}";


        return null;
    }
}
