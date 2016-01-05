package guru.springframework.gof.observer.observerimpl;

import java.math.BigDecimal;

public interface Observer {
    public void update(Observer observer,String productName, BigDecimal bidAmount);
  }
