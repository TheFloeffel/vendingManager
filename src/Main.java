import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap cig = new HashMap();
        HashMap snacks = new HashMap();


        Cigarettes marlboror = new Cigarettes("Marlboro red", "Marlboro", 9.80, 12.4);
        Cigarettes marlborog = new Cigarettes("Marlboro gold", "Marlboro", 9.90, 9.9);

        cig.put(marlboror, 30);
        cig.put(marlborog, 15);


        Cigarette_machine auto1 = new Cigarette_machine(50, cig);


        Drink d1 = new Drink("cola", "coca-cola", 4.5, LocalDate.parse("2020-02-13"), 500);
        Drink d2 = new Drink("redbulllight", "redbull", 5.3, LocalDate.parse("2020-02-15"), 250);
        Snack s1 = new Snack("Pombaer", "Baersnack", 3.2, LocalDate.parse("2030-03-03"), 300);
        Snack s2 = new Snack("Snicker-white", "Snickers", 3.2, LocalDate.parse("2035-03-03"), 100);

        snacks.put(d1, 10);
        snacks.put(d2, 15);
        snacks.put(s1, 20);
        snacks.put(s2, 10);

        SnackDrink_machine auto2 = new SnackDrink_machine(60, snacks);

        auto2.restock();
        auto2.show_stock();
        auto2.purchase("Pombaer");
        auto2.purchase("cola");
        auto2.show_money_in_machine();
        auto2.show_popular_item();
        auto2.get_money();
        auto2.show_stock();

    }
}
