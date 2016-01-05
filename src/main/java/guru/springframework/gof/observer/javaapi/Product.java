package guru.springframework.gof.observer.javaapi;


import java.util.Observable;
import java.util.Observer;
import java.math.BigDecimal;

public class Product extends Observable{
    private String productName;
    private BigDecimal bidAmount;
    private Observer observer;
    public Observer getObserver() {
        return observer;
    }
    public BigDecimal getBidAmount() {
        return bidAmount;
    }
    public String getProductName() {
        return productName;
    }

    public Product(String productName, BigDecimal bidAmount){
        this.productName=productName;
        this.bidAmount=bidAmount;
    }

    public void setBidAmount(Observer observer,BigDecimal newBidAmount){
        System.out.println("-----------------New bid placed----------------");
        int res=bidAmount.compareTo(newBidAmount);
        if(res==-1){
            this.observer=observer;
            this.bidAmount=newBidAmount;
            setChanged();
            notifyObservers();
        }
        else {
            System.out.println("New bid amount cannot be less or equal to current bid amount: "+this.bidAmount);
        }
    }
}
