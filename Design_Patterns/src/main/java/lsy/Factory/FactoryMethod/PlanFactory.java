package lsy.Factory.FactoryMethod;

/**
 * @author lsy
 * 飞机工厂类
 */
public class PlanFactory {
    public MoveAble create(){
        return new Plan();
    }
}
