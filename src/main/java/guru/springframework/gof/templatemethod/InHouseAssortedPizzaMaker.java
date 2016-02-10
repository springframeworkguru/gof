package guru.springframework.gof.templatemethod;


public class InHouseAssortedPizzaMaker extends PizzaMaker {
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing sweet corns,chicken sausage, green chillies, and onions.");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding cheddar cheese and  bechamel sauce along with ingredients to crust.");
    }

    @Override
    public boolean customerWantsPackedPizza() {
        return false;
    }
}
