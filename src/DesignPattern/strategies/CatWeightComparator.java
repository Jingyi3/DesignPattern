package DesignPattern.strategies;

/**
 * Created by ZJYYY on 2018/6/23.
 */
public class CatWeightComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Cat c1 = (Cat) o1;
        Cat c2 = (Cat) o2;
        if (c1.getWeight() > c2.getHeight()) {
            return -1;
        } else if (c1.getWeight() < c2.getWeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}
