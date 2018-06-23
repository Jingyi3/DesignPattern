package DesignPattern.strategies;
import java.lang.Comparable;

/**
 * Created by ZJYYY on 2018/6/22.
 */
public class DataSorter {

    //在sort方法里面会假设你传给我的任何一个数组都实现了Comparable接口
    //因此我可以把这个数据里免得任何一个对象都转换成comparable接口类型的对象
    //由于多态，这里的Object是什么类型就会调用什么类型的compareTo方法
    public static void sort(Object[] a) {
        for (int i = a.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                Comparable o1 = (Comparable) a[j];
                Comparable o2 = (Comparable) a[j+1];

                if (o1.compareTo(o2)== 1) {
                    swap(a, j, j + 1);
                }

            }
        }
    }

    public static void swap(Object[] a, int x, int y) {
        Object temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }


    public static void p(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
}

