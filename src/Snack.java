import java.time.LocalDate;

public class Snack extends Consumable {
    private int size_g;


    public Snack(String name, String brand, Double price, LocalDate expirations_date, int size_g) {
        super(name, brand, price, expirations_date);
        this.size_g = size_g;
    }
}
