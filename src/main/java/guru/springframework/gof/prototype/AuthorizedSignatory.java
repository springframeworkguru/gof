package guru.springframework.gof.prototype;

/**
 * Created by Admin on 4/21/2015.
 */
public class AuthorizedSignatory implements Cloneable {
    private String name;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "[AuthorizedSignatory: Name - " + getName() + ", Designation - " + getDesignation() + "]";
    }
}
