package guru.springframework.gof.flyweight;

public class RaceCarClient {
    private RaceCar raceCar;
    public RaceCarClient(String name) {
        /*Ask factory for a RaceCar*/
        raceCar = CarFactory.getRaceCar(name);
    }
     /**
     * The extrinsic state of the flyweight is maintained by the client
     */
    private int currentX = 0;
    private int currentY=0;
    public void moveCar(int newX, int newY){
    /*Car movement is handled by the flyweight object*/
        raceCar.moveCar(currentX,
                currentY, newX, newY);
        currentX = newX;
        currentY = newY;
    }

}
