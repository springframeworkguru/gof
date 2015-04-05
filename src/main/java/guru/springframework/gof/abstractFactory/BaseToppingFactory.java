package guru.springframework.gof.abstractFactory;

import guru.springframework.gof.abstractFactory.topping.Cheese;
import guru.springframework.gof.abstractFactory.topping.Sauce;

/**
 * Created by Admin on 4/4/2015.
 */
public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
