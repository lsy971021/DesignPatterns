package lsy.Factory.SimpleFactory;

/**
 * @author lsy
 * 可拓展性不好
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
