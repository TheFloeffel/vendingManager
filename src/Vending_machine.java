import java.util.HashMap;

public interface Vending_machine {
    int maxstock = 50;


    void show_stock();

    void show_money_in_machine();

    void show_popular_item();

    void restock();
}
