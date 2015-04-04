package guru.springframework.gof.abstractFactory;

import guru.springframework.gof.abstractFactory.product.Pizza;
import org.junit.Test;
/**
 * Created by Admin on 4/5/2015.
 */
public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
    BasePizzaFactory pizzaFactory=new GourmetPizzaFactory();
        Pizza cheesePizza= pizzaFactory.createPizza("cheese");
        Pizza veggiePizza=pizzaFactory.createPizza("veggie");
    }
}