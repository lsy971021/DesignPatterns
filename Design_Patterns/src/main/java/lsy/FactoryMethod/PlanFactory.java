package lsy.FactoryMethod;

/**
 * @author lsy
 * 飞机工厂类
 */
public class PlanFactory implements CreateFactory{
    @Override
    public MoveAble create(){
        return new Plan();
    }
}
