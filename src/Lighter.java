public class Lighter extends Vending_item {
    protected int lighterfluid_ml;

    public Lighter(String name, String brand, Double price, int lighterfluid_ml) {
        super(name, brand, price);
        this.lighterfluid_ml = lighterfluid_ml;
    }
}
