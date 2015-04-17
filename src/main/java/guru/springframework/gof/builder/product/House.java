package guru.springframework.gof.builder.product;

/**
 * Created by Admin on 4/16/2015.
 */
public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean furnished;
    private boolean painted;

    public void setFoundation(String foundation) {
        this. foundation = foundation;
    }
    public void setStructure(String structure) {
        this.structure = structure;
    }
    public void setRoof(String roof) {
        this.roof = roof;
    }
    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }
    public void setPainted(boolean painted) {
        this.painted = painted;
    }
    @Override
    public String toString() {
        return "Foundation - " + foundation + " Structure - " + structure + " Roof - " + roof +" Is Furnished? "+furnished+" Is Painted? "+painted;
    }

}
