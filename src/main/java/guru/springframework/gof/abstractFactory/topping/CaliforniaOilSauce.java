package guru.springframework.gof.abstractFactory.topping;

/**
 * Created by Admin on 4/5/2015.
 */
public class CaliforniaOilSauce implements Sauce {
    public CaliforniaOilSauce(){
        prepareSauce();
    }
    @Override
    public void prepareSauce() {
        System.out.println("Preparing california oil sauce..");
    }
}
