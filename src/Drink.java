import java.time.LocalDate;

public class Drink extends Consumable {
    private int size_ml;


    public Drink(String name, String brand, Double price, LocalDate expirations_date, int size_ml) {
        super(name, brand, price, expirations_date);
        this.size_ml = size_ml;
    }
}
