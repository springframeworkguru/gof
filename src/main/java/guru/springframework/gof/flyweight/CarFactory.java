package guru.springframework.gof.flyweight;


import java.util.HashMap;
import java.util.Map;
public class CarFactory {
    private static Map<String, RaceCar> flyweights = new HashMap<>();
    /*If key exist, return flyweight from Map*/
    public static RaceCar getRaceCar(String key) {
        if(flyweights.containsKey(key)){
            return flyweights.get(key);
        }
        RaceCar raceCar;
        /*If key does not exist in Map, create flyweight, put it in Map, and return the object*/
        switch (key)
        {
            case "Midget":
                raceCar = new FlyweightMidgetCar();
                raceCar.name="Midget Car";
                raceCar.speed=140;
                raceCar.horsePower=400;
                break;
            case "Sprint":
                raceCar = new FlyweightSprintCar();
                raceCar.name="Sprint Car";
                raceCar.speed=160;
                raceCar.horsePower=1000;
                break;
            default:
                throw new IllegalArgumentException("Unsupported car type.");
        }
        flyweights.put(key, raceCar);
        return raceCar;
    }
}
