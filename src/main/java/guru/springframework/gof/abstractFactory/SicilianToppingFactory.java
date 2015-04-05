package guru.springframework.gof.abstractFactory;

import guru.springframework.gof.abstractFactory.topping.Cheese;
import guru.springframework.gof.abstractFactory.topping.MozzarellaCheese;
import guru.springframework.gof.abstractFactory.topping.Sauce;
import guru.springframework.gof.abstractFactory.topping.TomatoSauce;

/**
 * Created by Admin on 4/5/2015.
 */
public class SicilianToppingFactory extends BaseToppingFactory{
    @Override
    public  Cheese createCheese(){return new MozzarellaCheese();}
    @Override
    public  Sauce createSauce(){return new TomatoSauce();}
}
