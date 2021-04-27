package lsy.proxy.v2;

/**
 * @author lsy
 */
public class Person implements Eat{
    @Override
    public void action() {
        System.out.println("吃饭了");
    }
}
