package guru.springframework.gof.facade.servicefacade;

import guru.springframework.gof.facade.domain.Product;
import guru.springframework.gof.facade.subcomponents.PaymentService;
import guru.springframework.gof.facade.subcomponents.ShippingService;
import guru.springframework.gof.facade.subcomponents.InventoryService;

public class OrderServiceFacadeImpl implements OrderServiceFacade{

    public boolean placeOrder(int pId){
        boolean orderFulfilled=false;
        Product product=new Product();
        product.productId=pId;
        if(InventoryService.isAvailable(product))
        {
            System.out.println("Product with ID: "+ product.productId+" is available.");
            boolean paymentConfirmed= PaymentService.makePayment();
            if(paymentConfirmed){
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled=true;
            }
        }
        return orderFulfilled;
    }
}
