package guru.springframework.gof.factoryMethod;

public abstract class BasePizzaFactory {
    public Pizza getPizza(String type){
        Pizza myPizza = this.createPizza(type);
        myPizza.addIngredients();
        myPizza.bakePizza();
        return myPizza;
    }
    public abstract Pizza createPizza(String type);
}
