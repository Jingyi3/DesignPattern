package DesignPattern.compiler.test;

import DesignPattern.Proxy.Movable;
import DesignPattern.Proxy.Tank;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        String rt = "\r\n";
        String src =
                "package DesignPattern.Proxy;"+ rt+
                        "public class TankTimeProxy implements Movable {"+ rt+
                        "public TankTimeProxy(Movable tank) {"+ rt+
                        "this.tank = tank;"+ rt+
                        "}"+ rt+

                        "Movable tank;"+ rt+


                        "@Override"+ rt+
                        "public void move() {"+ rt+
                        "long start = System.currentTimeMillis();"+ rt+
                        "System.out.println(\"start time: \"+ start);"+ rt+

                        "tank.move();"+ rt+

                        "long end = System.currentTimeMillis();"+ rt+
                        "System.out.println(\"run time: \" + (end - start));"+ rt+
                        "}"+ rt+

                        "}";
        String filename = System.getProperty("user.dir") + "/src/DesignPattern/Proxy/TankTimeProxy.java";
        //"user.dir" 当前项目根路径
        FileWriter fw = new FileWriter(filename);
        fw.write(src);
        fw.flush();
        fw.close();
        //源码
        //--------------------------

        //编译
        //compile
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        Iterable units = fileManager.getJavaFileObjects(filename);
        JavaCompiler.CompilationTask t = compiler.getTask(null, fileManager, null, null, null, units);
        t.call();
        fileManager.close();
        //生成了一个class文件

        //load into memory and create an instance
        //把硬盘上的文件放到内存里的类
        URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir") + "/src")};
        URLClassLoader ul = new URLClassLoader(urls);
        Class c = ul.loadClass("DesignPattern.Proxy.TankTimeProxy");
        //System.out.println(c);
        //找到构造方法
        Constructor ctr = c.getConstructor(Movable.class);
        Movable m = (Movable) ctr.newInstance(new Tank());
        m.move();
    }
}
