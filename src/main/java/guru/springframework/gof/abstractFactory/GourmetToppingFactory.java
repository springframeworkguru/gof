package guru.springframework.gof.abstractFactory;

import guru.springframework.gof.abstractFactory.topping.CaliforniaOilSauce;
import guru.springframework.gof.abstractFactory.topping.Cheese;
import guru.springframework.gof.abstractFactory.topping.GoatCheese;
import guru.springframework.gof.abstractFactory.topping.Sauce;

/**
 * Created by Admin on 4/5/2015.
 */
public class GourmetToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese(){return new GoatCheese();}
    @Override
    public Sauce createSauce(){return new CaliforniaOilSauce();}
}
