import java.awt.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class Cigarette_machine implements  Vending_machine {
    HashMap<Vending_item, Integer> stock_target = new HashMap<Vending_item, Integer>();
    HashMap<Vending_item, Integer> stock_current = new HashMap<Vending_item, Integer>();


    public Cigarette_machine(HashMap<Vending_item, Integer> stock_target) {
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





}
