package DesignPattern.Iterator;

/**
 * Created by ZJYYY on 2018/6/21.
 */
public class Cat {
    private int id;

    public Cat(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "cat:" + id;
    }
}
