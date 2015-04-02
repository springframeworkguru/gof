package guru.springframework.gof.factoryMethod;

public class CheesePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}
