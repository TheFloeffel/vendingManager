public class Vending_item {
    String name;
    String brand;
    Double price;


    public Vending_item(String name, String brand, Double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }


    String stillgood() {
        return "true";
    }
}
