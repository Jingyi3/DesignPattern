package DesignPattern.Iterator;

/**
 * Created by ZJYYY on 2018/6/21.
 *
 * 当你写一个组建的时候，功能越细越好
 */

//使用接口实现，面向接口编程，灵活可扩展

public class Test {
    public static void main(String[] args) {
        //ArrayList al = new ArrayList();
        //LinkedList al = new LinkedList();
        Collection c = new ArrayList();
        for (int i = 0; i < 15; i++) {
            c.add(new Cat(i));
        }
        System.out.println(c.size());
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o + " ");
        }
    }
}
