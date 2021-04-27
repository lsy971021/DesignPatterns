package lsy.proxy.v1;

/**
 * @author lsy
 */
public class EatProxy implements Eat{
    Eat eat;
    @Override
    public void action() {
        System.out.println("洗手....");
        eat.action();
    }

    public EatProxy(Eat eat) {
        this.eat = eat;
    }
}
