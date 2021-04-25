package lsy.Factory.FactoryMethod;

/**
 * @author lsy
 * 汽车工厂类
 */
public class CarFactory implements CreateFactory{
    @Override
    public MoveAble create(){
        return new Car();
    }
}
