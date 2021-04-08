import java.util.HashMap;

public class Vending_machine {
    int maxstock;
    double money;
    HashMap<Vending_item, Integer> stock_target = new HashMap<Vending_item, Integer>();
    HashMap<Vending_item, Integer> stock_current = new HashMap<Vending_item, Integer>();


    public Vending_machine(int maxstock, HashMap<Vending_item, Integer> stock_target) {
        this.maxstock = maxstock;
        this.money = 0;

        initialize(stock_target);
    }

    void initialize(HashMap<Vending_item, Integer> stock_target){
        int quantity = 0;

        for (Integer i : stock_target.values()){
            quantity += i;
        }
        if (quantity <= this.maxstock) {
            this.stock_target = stock_target;

            for (Vending_item i : stock_target.keySet()) {
                stock_current.put(i, 0);
            }
        } else {
            System.out.println("This is too much for me :(");
        }
    }

    void show_stock() {
        System.out.println("\ncurrent stock:");
        System.out.println("______________");
        for (Vending_item i : stock_current.keySet()){
            System.out.println(i.name + " : " + stock_current.get(i));
        }
    }

    void show_money_in_machine(){
        System.out.println("\nThis machine houses: ");
        System.out.println("--------------------");
        System.out.println(this.money + " $");
    }

    void show_popular_item(){
        Vending_item pop = null;
        int dif = 0;
        for (Vending_item i : stock_current.keySet()) {
            int temp_dif = stock_target.get(i) - stock_current.get(i);

            if (temp_dif > dif) {
                dif = temp_dif;
                pop = i;
            }
        }

        if (pop == null) {
            System.out.println("\nNo products have been sold yet");


        } else {
            System.out.println("\nmost popular item:");
            System.out.println("------------------");
            System.out.println(pop.name + " from " + pop.brand);
        }
    }

    void restock(){
        System.out.println("\nrestocked:");
        System.out.println("----------");
        for (Vending_item i : stock_current.keySet()) {
            int dif = stock_target.get(i) - stock_current.get(i);
            System.out.println(i.name + " : " + dif);
            int new_value = stock_target.get(i);
            stock_current.replace(i, new_value);
        }
    }


    void purchase(String product_name) {
        for (Vending_item i : stock_current.keySet()) {
            if (i.name.equals(product_name)) {
                if (i.stillgood().equals("true")) {
                    if (stock_current.get(i) > 0) {
                        int new_value = stock_current.get(i) - 1;
                        stock_current.replace(i, new_value);
                        System.out.println("\n" + i.name + "cost: " + i.price + " please use the card-reader to pay");
                        this.money += i.price;
                        System.out.println("thank you for your purchase");
                        System.out.println("**product falls out of machine**");
                    } else {
                        System.out.println("\nsadly we are out of stock");
                    }
                } else {
                    System.out.println("\ncan't sell this, product expired on " + i.stillgood());
                }
            }
        }
    }

    void get_money(){
        System.out.println("\nThis machine housed: ");
        System.out.println("--------------------");
        System.out.println(this.money + " $");
        System.out.println("now it's yours");
        this.money = 0;
    }

}
