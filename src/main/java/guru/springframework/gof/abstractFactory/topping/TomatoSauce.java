package guru.springframework.gof.abstractFactory.topping;

/**
 * Created by Admin on 4/5/2015.
 */
public class TomatoSauce implements Sauce {
    public TomatoSauce(){
        prepareSauce();
    }
     @Override
    public void prepareSauce() {
        System.out.println("Preparing tomato sauce..");
    }
}
