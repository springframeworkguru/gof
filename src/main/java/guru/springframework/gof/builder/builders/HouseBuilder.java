package guru.springframework.gof.builder.builders;

import guru.springframework.gof.builder.product.House;

/**
 * Created by Admin on 4/16/2015.
 */
public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
