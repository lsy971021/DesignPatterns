package lsy.Factory.AbstractFactory;

/**
 * @author lsy
 * 适用于现代人的工厂
 */
public class ModernFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Water createWater() {
        return new Coke();
    }
}
