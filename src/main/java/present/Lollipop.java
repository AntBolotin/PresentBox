package present;

public class Lollipop extends Present {

    private String type;

    public Lollipop(String name, Double weight, Double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Lollipop + [" + super.toString() + ", type  = " + type + "]";
    }

}
