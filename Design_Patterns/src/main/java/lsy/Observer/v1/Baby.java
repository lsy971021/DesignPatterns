package lsy.observer.v1;

/**
 * @author lsy
 */
public class Baby {
    boolean cry = false;
    public boolean isCry(){
        return cry;
    }
    public void wakeUp(){
        System.out.println("baby is waking up!");
        cry = true;
    }
}
