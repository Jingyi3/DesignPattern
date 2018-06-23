package DesignPattern.OO;

/**
 * Created by ZJYYY on 2018/6/21.
 */
public class Test01 {

}

class Cow{
    int age;

    public Cow(int age) {
        this.age = age;
    }

    public void giveBirth(int age) {
        if (age == 5) {
            new Cow(1);
        }
    }
}