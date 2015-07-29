package guru.springframework.gof.facade.subcomponents;


import guru.springframework.gof.facade.domain.Product;

public class InventoryService {
    public static boolean isAvailable(Product product){
        /*Check Warehouse database for product availability*/
        return true;
    }
}
