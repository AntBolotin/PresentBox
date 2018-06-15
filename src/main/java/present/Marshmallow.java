package present;

public class Marshmallow extends Present {

    private Double caloricity;

    public Marshmallow(String name, Double weight, Double price, Double caloricity) {
        super(name, weight, price);
        this.caloricity = caloricity;
    }

    public Double getCaloricity() {
        return caloricity;
    }

    public void setCaloricity(Double caloricity) {
        this.caloricity = caloricity;
    }

    @Override
    public String toString() {
        return "Marshmallow + [" + super.toString() + ", caloricity  = " + caloricity + "]";
    }
}
