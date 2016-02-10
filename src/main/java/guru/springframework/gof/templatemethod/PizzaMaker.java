package guru.springframework.gof.templatemethod;

public abstract class PizzaMaker {
    public void makePizza() {
        preparePizzaDough();
        preBakeCrust();
        prepareIngredients();
        addToppings();
        bakePizza();
        if (customerWantsPackedPizza()) {
            packPizza();
        }
    }

    final void preparePizzaDough() {
        System.out.println("Preparing pizza dough with plain flour, dried yeast, caster sugar, salt, olive oil, and warm water.");
    }

    final void preBakeCrust() {
        System.out.println("Pre baking crust at 325 F for 3 minutes.");
    }

    abstract void prepareIngredients();

    abstract void addToppings();

    void bakePizza() {
        System.out.println("Baking pizza at 400 F for 12 minutes.");
    }

    void packPizza() {
        System.out.println("Packing pizza in pizza delivery box.");
    }

    boolean customerWantsPackedPizza() {
        return true;
    }
}
