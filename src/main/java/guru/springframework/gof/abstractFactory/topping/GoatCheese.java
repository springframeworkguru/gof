package guru.springframework.gof.abstractFactory.topping;

/**
 * Created by Admin on 4/5/2015.
 */
public class GoatCheese implements Cheese {

    public  GoatCheese(){
       prepareCheese();
    }
    @Override
    public void prepareCheese(){
        System.out.println("Preparing goat cheese...");
    }
}
