import java.util.ArrayList;
import java.util.HashMap;

public class Drink_machine implements Vending_machine {
    HashMap<Vending_item, Integer> stock_target = new HashMap<Vending_item, Integer>();
    HashMap<Vending_item, Integer> stock_current = new HashMap<Vending_item, Integer>();


    public Drink_machine(HashMap<Vending_item, Integer> stock_target) {
        int quantity = 0;

        for (Integer i : stock_target.values()){
            quantity += i;
        }
        if (quantity <= 50) {
            this.stock_target = stock_target;

            for (Vending_item i : stock_target.keySet()) {
                stock_current.put(i, 0);
            }
        } else {
            System.out.println("This is too much for me :(");
        }
    }

    @Override
    public void show_stock() {
        for (Vending_item i : stock_current.keySet()){
            System.out.println(i.name + " : " + stock_current.get(i));
        }
    }

    @Override
    public void show_money_in_machine() {

    }

    @Override
    public void show_popular_item() {

    }

    @Override
    public void restock() {
        System.out.println("\nrestocked:");
        System.out.println("----------");
        for (Vending_item i : stock_current.keySet()) {
            int dif = stock_target.get(i) - stock_current.get(i);
            System.out.println(i.name + " : " + dif);
        }

        stock_current = stock_target;
    }

    @Override
    public void purchase() {

    }
}
