import java.time.LocalDate;

public class Consumable extends Vending_item {
    private LocalDate expirations_date;


    public Consumable(String name, String brand, Double price, LocalDate expirations_date) {
        super(name, brand, price);
        this.expirations_date = expirations_date;
    }
}
