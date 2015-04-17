package guru.springframework.gof.builder.director;

import guru.springframework.gof.builder.builders.HouseBuilder;
import guru.springframework.gof.builder.product.House;

/**
 * Created by Admin on 4/16/2015.
 */
public class ConstructionEngineer {
    private HouseBuilder houseBuilder;
    public ConstructionEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.paintHouse();
        this.houseBuilder.furnishHouse();
        return this.houseBuilder.getHouse();

    }
}
