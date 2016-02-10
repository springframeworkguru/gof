package guru.springframework.gof.templatemethod;

import org.junit.Test;

import static org.junit.Assert.*;


public class PizzaMakerTest {

    @Test
    public void testMakePizza() throws Exception {
        System.out.println("-----Making Veg Pizza-----");
        VegPizzaMaker vegPizzaMaker = new VegPizzaMaker();
        vegPizzaMaker.makePizza();

        System.out.println("-----Making Non Veg Pizza-----");
        NonVegPizzaMaker nonVegPizzaMaker = new NonVegPizzaMaker();
        nonVegPizzaMaker.makePizza();

        System.out.println("-----Making In-House Assorted Pizza-----");
        InHouseAssortedPizzaMaker inHouseAssortedPizzaMaker = new InHouseAssortedPizzaMaker();
        inHouseAssortedPizzaMaker.makePizza();


    }
}