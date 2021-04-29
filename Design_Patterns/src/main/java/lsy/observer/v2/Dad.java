package lsy.observer.v2;

/**
 * @author lsy
 */
public class Dad implements Observer {
    public void concert(){
        System.out.println("dad care about baby");
    }

    @Override
    public void action(EventSource source) {
        concert();
        IsCry.cry=false;
    }
}
