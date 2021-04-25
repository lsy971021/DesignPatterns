package lsy.Factory.AbstractFactory;

/**
 * @author lsy
 * 创建不同族的工厂
 */
public abstract class AbstractFactory {
    /**
     * 创建一个吃的工厂
     * @return
     */
    abstract Food createFood();

    /**
     * 创建一个喝的工厂
     * @return
     */
    abstract Water createWater();
}
