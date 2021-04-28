package lsy.SimpleFactory;

/**
 * @author lsy
 * 交通工具简单工厂类
 */
public class VehicleFactory {
    /**
     * 创建一个Car
     * @return
     */
    public Car createCar(){
        return new Car();
    };
    public Plan createPlan(){
        return new Plan();
    };
}
