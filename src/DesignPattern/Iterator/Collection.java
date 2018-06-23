package DesignPattern.Iterator;

/**
 * Created by ZJYYY on 2018/6/21.
 */
public interface Collection {
    int size();
    void add(Object o);

    Iterator iterator();

}
