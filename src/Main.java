import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("hello world");

        HashMap cig = new HashMap();


        Cigarettes marlboror = new Cigarettes("Marlboro red", "Marlboro", 9.80, 12.4);
        Cigarettes marlborog = new Cigarettes("Marlboro gold", "Marlboro", 9.90, 9.9);

        cig.put(marlboror, 30);
        cig.put(marlborog, 15);


        Cigarette_machine auto1 = new Cigarette_machine(cig);


        auto1.restock();
        auto1.show_stock();

    }
}
