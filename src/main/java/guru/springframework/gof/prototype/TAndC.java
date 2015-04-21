package guru.springframework.gof.prototype;

/**
 * Created by Admin on 4/21/2015.
 */
public class TAndC extends PrototypeCapableDocument {

    @Override
    public PrototypeCapableDocument cloneDocument() {
        /*Clone with shallow copy*/
        TAndC tAndC = null;
        try {
            tAndC = (TAndC) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tAndC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
    }

}