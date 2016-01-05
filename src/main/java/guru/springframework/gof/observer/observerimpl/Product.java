package guru.springframework.gof.observer.observerimpl;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Product implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();
    private String productName;
    private BigDecimal bidAmount;
    private Observer observer;

    public Product(String productName, BigDecimal bidAmount){
        this.productName=productName;
        this.bidAmount=bidAmount;
    }

    @Override
    public void setBidAmount(Observer observer,BigDecimal newBidAmount){
        int res=bidAmount.compareTo(newBidAmount);
        if(res==-1){
            this.observer=observer;
            this.bidAmount=newBidAmount;
            notifyObservers();
        }
        else {
            System.out.println("New bid amount cannot be less or equal to current bid amount: "+this.bidAmount);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("-----------------"+observer+" has withdrawn from bidding----------------");
    }

    @Override
    public void notifyObservers() {
        System.out.println("-----------------New bid placed----------------");
        for (Observer ob : observers) {
            ob.update(this.observer,this.productName,this.bidAmount );
        }
    }

}
