package lsy.Factory.FactoryMethod;

/**
 * @author lsy
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
