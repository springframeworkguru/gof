package guru.springframework.gof.observer.observerimpl;

import java.math.BigDecimal;

public class Bidder implements Observer{
    String bidderName;
    public Bidder(String bidderName) {
        this.bidderName = bidderName;
    }

    @Override
    public void update(Observer observer,String productName, BigDecimal bidAmount){
        if(observer.toString().equals(bidderName)){
            System.out.println("Hello "+bidderName+"! New bid of amount "+bidAmount+" has been placed on "+productName+" by you");
        }
        if(!observer.toString().equals(bidderName)) {
            System.out.println("Hello " + bidderName + "! New bid of amount " + bidAmount + " has been placed on " + productName + " by " + observer);
        }
    }

    @Override
    public String toString(){
        return bidderName;
    }
}
