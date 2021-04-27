package lsy.proxy.v1;

/**
 * @author lsy
 */
public class EatProxy2 implements Eat{
    Eat eat;

    public EatProxy2(Eat eat) {
        this.eat = eat;
    }

    @Override
    public void action() {
        eat.action();
        System.out.println("吃完饭刷完....");
    }
}
