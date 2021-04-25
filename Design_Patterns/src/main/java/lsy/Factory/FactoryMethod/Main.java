package lsy.Factory.FactoryMethod;

/**
 * @author lsy
 * 工厂方法创建一般只有一个方法，创建一种产品
 * 简单工厂模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改。
 * 解决：
 * 创建一个工厂接口和创建多个工厂实现类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 汽车工厂类
         */
        CarFactory carFactory = new CarFactory();
        MoveAble car = carFactory.create();
        car.go();
        /**
         * 飞机工厂类
         */
        PlanFactory planFactory = new PlanFactory();
        MoveAble plan = planFactory.create();
        plan.go();
    }
}
