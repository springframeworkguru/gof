package guru.springframework.gof.composite;


import java.util.ArrayList;
import java.util.Iterator;

public class ProductCatalog extends CatalogComponent{
    private ArrayList<CatalogComponent> items=new ArrayList<>();
    private String name;
    public ProductCatalog(String name){
        this.name=name;
    }


     public ArrayList<CatalogComponent> getItems() {
        return items;
    }
    public CatalogComponent getChildItems(int  itemNo){
       return (CatalogComponent)items.get(itemNo);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void add(CatalogComponent catalogComponent){
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent){
        items.remove(catalogComponent);
    }
    @Override
    public void print(){

        Iterator itemIterator= items.iterator();
        while(itemIterator.hasNext())
        {
            CatalogComponent comp=(CatalogComponent)itemIterator.next();
            comp.print();
        }
    }

}
