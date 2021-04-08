import java.util.ArrayList;
import java.util.HashMap;

public class SnackDrink_machine extends Vending_machine {


    public SnackDrink_machine(int maxstock, HashMap<Vending_item, Integer> stock_target) {
        super(maxstock, stock_target);
    }


    @Override
    void show_stock() {
        System.out.println("\ncurrent stock:");
        System.out.println("______________");
        for (Vending_item i : stock_current.keySet()){
            System.out.print(i.name + " : " + stock_current.get(i));

            if (!i.stillgood().equals("true")) {
                System.out.println(" --> this product expired on " + i.stillgood());
            } else {
                System.out.println();
            }
        }
    }
}
