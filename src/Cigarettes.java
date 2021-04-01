public class Cigarettes extends Vending_item {
    private Double nicotine_content_mg;

    public Cigarettes(String name, String brand, Double price, Double nicotine_content_mg) {
        super(name, brand, price);
        this.nicotine_content_mg = nicotine_content_mg;
    }
}
