package lsy.Observer.v2;

/**
 * @author lsy
 */
public class Baby implements EventSource<Baby>{
    @Override
    public void event(){
        System.out.println("baby is waking up!");
        IsCry.cry=true;
    }

    @Override
    public Baby getSource() {
        return this;
    }
}
