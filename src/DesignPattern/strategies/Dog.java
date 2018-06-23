package DesignPattern.strategies;

/**
 * Created by ZJYYY on 2018/6/22.
 */
public class Dog implements Comparable {

    private int food;

    public Dog(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Object o) {
        Dog d = (Dog) o;
        if (this.getFood() > d.getFood()) {
            return 1;
        } else if (this.getFood() < d.getFood()){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.food + "";

    }
}
