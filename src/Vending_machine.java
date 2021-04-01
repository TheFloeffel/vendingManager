import java.util.HashMap;

public class Vending_machine {
    int maxstock = 50;
    HashMap<Vending_item, Integer> stock_target = new HashMap<Vending_item, Integer>();
    HashMap<Vending_item, Integer> stock_current = new HashMap<Vending_item, Integer>();

    void show_stock() {
        for (Vending_item i : stock_current.keySet()){
            System.out.println(i.name + " : " + stock_current.get(i));
        }
    }

    void show_money_in_machine(){

    }

    void show_popular_item(){

    }

    void restock(){
        System.out.println("\nrestocked:");
        System.out.println("----------");
        for (Vending_item i : stock_current.keySet()) {
            int dif = stock_target.get(i) - stock_current.get(i);
            System.out.println(i.name + " : " + dif);
        }

        stock_current = stock_target;
    }


    void purchase(){

    }
}
