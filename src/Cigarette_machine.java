import java.awt.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Cigarette_machine extends Vending_machine {


    public Cigarette_machine(int maxstock, HashMap<Vending_item, Integer> stock_target) {
        super(maxstock, stock_target);
    }


    @Override
    void purchase(String product_name) {
        if (age()) {
            super.purchase(product_name);
        } else {
            System.out.println("\nsorry kid, you're not old enough yet");
        }
    }

    boolean age() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your age: ");
        int age = scan.nextInt();

        if (age >= 16) {
            return true;
        } else {
            return false;
        }
    }
}
