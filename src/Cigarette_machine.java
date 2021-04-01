import java.awt.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class Cigarette_machine implements  Vending_machine {
    HashMap<Vending_item, Integer> stock_target = new HashMap<Vending_item, Integer>();
    HashMap<Vending_item, Integer> stock_current = new HashMap<Vending_item, Integer>();


    public Cigarette_machine(HashMap<Vending_item, Integer> stock_target) {
        this.stock_target = stock_target;
    }

    @Override
    public void show_stock() {

    }

    @Override
    public void show_money_in_machine() {

    }

    @Override
    public void show_popular_item() {

    }

    @Override
    public void restock() {
        System.out.println("restocked:\n");
        for (Object i : stock_current.keySet()) {
            int dif = stock_target.get(i) - stock_current.get(i);

            System.out.println(i + " : " + dif);
        }
    }
}
