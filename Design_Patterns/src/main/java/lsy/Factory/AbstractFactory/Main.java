package lsy.Factory.AbstractFactory;

/**
 * @author lsy
 *
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 现代人吃喝
         */
        AbstractFactory modern = new ModernFactory();
        Food modernFood = modern.createFood();
        modernFood.eat();
        Water modernWater = modern.createWater();
        modernWater.drink();
        /**
         * 老人吃喝
         */
        AbstractFactory old = new OldFactory();
        Water oldWater = old.createWater();
        oldWater.drink();
        Food oldFood = old.createFood();
        oldFood.eat();
    }
}
