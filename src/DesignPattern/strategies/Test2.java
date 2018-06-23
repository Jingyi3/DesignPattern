package DesignPattern.strategies;

/**
 * Created by ZJYYY on 2018/6/22.
 */
public class Test2 {
    public static void main(String[] args) {
//        int[] a = {9, 5, 3, 7, 1};
        Cat[] a = {new Cat(10, 1), new Cat(3, 2), new Cat(5, 5)};
        //Dog[] a = {new Dog(20), new Dog(10), new Dog(88)};
        //DataSorter.sort(a);
        java.util.Arrays.sort(a);
        DataSorter.p(a);

    }
}
