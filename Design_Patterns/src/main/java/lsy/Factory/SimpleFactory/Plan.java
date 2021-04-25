package lsy.Factory.SimpleFactory;

/**
 * @author lsy
 */
public class Plan implements MoveAble{
    @Override
    public void go(){
        System.out.println("飞机起飞了。。。");
    }
}
