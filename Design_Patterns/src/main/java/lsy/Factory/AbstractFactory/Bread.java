package lsy.Factory.AbstractFactory;

/**
 * @author lsy
 * 面包类
 */
public class Bread extends Food{
    @Override
    void eat() {
        System.out.println("吃面包🍞");
    }
}
