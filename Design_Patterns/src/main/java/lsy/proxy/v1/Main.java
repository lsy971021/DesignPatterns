package lsy.proxy.v1;

/**
 * @author lsy
 */
public class Main {
    public static void main(String[] args) {
        Eat eat = new EatProxy(new EatProxy2(new Person()));
        eat.action();
    }
}
