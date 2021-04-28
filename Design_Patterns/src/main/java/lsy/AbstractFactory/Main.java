package lsy.AbstractFactory;

/**
 * @author lsy
 * 抽象工厂一般有多个方法，创建一系列产品。
 * 抽象工厂模式中我们可以定义实现不止一个接口，一个工厂也可以生成不止一个产品类，
 * 抽象工厂模式较好的实现了“开放-封闭”原则，是三个模式中较为抽象，并具一般性的
 * 模式。我们在使用中要注意使用抽象工厂模式的条件。
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
