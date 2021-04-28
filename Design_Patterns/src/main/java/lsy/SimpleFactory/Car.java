package lsy.SimpleFactory;

/**
 * @author lsy
 */
public class Car implements MoveAble{
    @Override
    public void go(){
        System.out.println("汽车开车了。。。");
    }
}
