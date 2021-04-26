package lsy.Observer;

/**
 * @author lsy
 */
public class Dad implements Observer{
    public void concert(){
        System.out.println("dad care about baby");
    }

    @Override
    public void action(Baby baby) {
        concert();
        baby.cry=false;
    }
}
