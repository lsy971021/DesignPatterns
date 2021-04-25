package lsy.Factory.FactoryMethod;

/**
 * @author lsy
 * 汽车工厂类
 */
public class CarFactory {
    public MoveAble create(){
        return new Car();
    }
}
