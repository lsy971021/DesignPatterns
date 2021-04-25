package lsy.Factory.AbstractFactory;

/**
 * @author lsy
 * 适用于老人的工厂
 */
public class OldFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new Vegetables();
    }

    @Override
    Water createWater() {
        return new Tea();
    }
}
