package lsy.SimpleFactory;

/**
 * @author lsy
 * 可拓展性不好
 * 简单工厂模式仅一个工厂类负责处理创建productA和productB；
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * 一个工厂类！！！
 */
public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Car car = vehicleFactory.createCar();
        car.go();
        Plan plan = vehicleFactory.createPlan();
        plan.go();
    }
}
