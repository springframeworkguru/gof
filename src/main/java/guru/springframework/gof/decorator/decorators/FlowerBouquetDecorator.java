package guru.springframework.gof.decorator.decorators;


import guru.springframework.gof.decorator.components.FlowerBouquet;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {
    public abstract String getDescription();
}
