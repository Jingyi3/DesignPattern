package DesignPattern.strategies;

/**
 * Created by ZJYYY on 2018/6/22.
 */
public class CatHeightComparator implements java.util.Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        if (c1.getHeight() > c2.getHeight()) {
            return 1;
        } else if (c1.getHeight() < c2.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}
