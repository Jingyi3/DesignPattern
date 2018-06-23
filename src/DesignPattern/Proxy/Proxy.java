package DesignPattern.Proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class Proxy {
    public static Object newProxyInstance(Class interf, InvocationHandler h) throws Exception {
        //对interf接口里的方法进行InvocationHandler--什么样的处理
        //实现动态编译 compilerAPI，CDlibrary 生成二进制文件，ASM
        String rt = "\r\n";
        String methodStr = "";

        Method[] methods = interf.getMethods();

        /*for (Method m : methods) {
            methodStr+="@Override"+rt+
                    "public void "+m.getName()+"(){"+rt+

                    "long start = System.currentTimeMillis();"+ rt+
                    "System.out.println(\"start time: \"+ start);"+ rt+

                    "tank."+m.getName()+"();"+ rt+

                    "long end = System.currentTimeMillis();"+ rt+
                    "System.out.println(\"run time: \" + (end - start));"+ rt+

                    "}";
        }*/

        for (Method m : methods) {
            methodStr += "@Override" + rt +
                    "public void " + m.getName() + "(){" + rt +
                    "try{" + rt +
                    "Method md = " + interf.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +
                    "h.invoke(this,md);" + rt +
                    "}catch(Exception e){" + rt +
                    "e.printStackTrace();}" + rt +

                    "}";
        }


        String src =
                "package DesignPattern.Proxy;" + rt +
                        "import java.lang.reflect.Method;" + rt +
                        "public class TankTimeProxy implements " + interf.getName() + " {" + rt +
                        "public TankTimeProxy(InvocationHandler h) {" + rt +
                        "this.h = h;" + rt +
                        "}" + rt +

                        "InvocationHandler h;" + rt +

                        methodStr +

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
        Constructor ctr = c.getConstructor(InvocationHandler.class);

        Object mm = ctr.newInstance(h);

        return mm;
    }
}
