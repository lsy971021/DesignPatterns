package lsy.facade;

/**
 * @author lsy
 * 相当于外卖骑手替你去买，就不用每个地方都去一遍
 */
public class Facade {
    Vegetables vegetables = new Vegetables();
    Meat meat = new Meat();
    Drink drink = new Drink();
    public void toBuy(){
        vegetables.bought();
        meat.bought();
        drink.bought();
    }
}
