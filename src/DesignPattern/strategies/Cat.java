package DesignPattern.strategies;

/**
 * Created by ZJYYY on 2018/6/22.
 */
public class Cat implements java.lang.Comparable<Cat> {
    private int height;
    private java.util.Comparator<Cat> comparator = new CatHeightComparator();
    private Comparator comparator2 = new CatWeightComparator();

    public java.util.Comparator getCompare() {
        return comparator;
    }

    public void setCompare(java.util.Comparator compare) {
        this.comparator = compare;
    }

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int weight;

    @Override
    public String toString() {
        return height + "|" + weight;
    }

    //可以使用不同的比较策略！！
    @Override
    public int compareTo(Cat o) {
        //new 一个CatHeight的比较器
        //使用成员变量的comparator比较器
        return comparator.compare(this, o);
        //return comparator2.compare(this, o);
    }

}
