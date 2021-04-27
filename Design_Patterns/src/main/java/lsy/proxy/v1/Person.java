package lsy.proxy.v1;

/**
 * @author lsy
 */
public class Person implements Eat{
    @Override
    public void action() {
        System.out.println("小刘吃饭了");
    }

}
