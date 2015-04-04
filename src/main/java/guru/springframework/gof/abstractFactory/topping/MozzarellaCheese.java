package guru.springframework.gof.abstractFactory.topping;

/**
 * Created by Admin on 4/5/2015.
 */
public class MozzarellaCheese implements Cheese{
    public  MozzarellaCheese(){prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheese...");
    }
}
