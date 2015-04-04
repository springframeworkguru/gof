package guru.springframework.gof.abstractFactory;


import guru.springframework.gof.abstractFactory.product.Pizza;

public abstract class BasePizzaFactory {
    
    public abstract Pizza createPizza(String type);
}
