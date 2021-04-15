import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Vending_itemTest {

    private Drink d1, d2;
    private Snack s1, s2;
    private Lighter l1;
    private Cigarettes c1;
    protected ArrayList vendingitems = new ArrayList();


    @BeforeEach
    void setUp() {
        d1 = new Drink("cola", "coca-cola", 4.5, LocalDate.parse("2020-02-13"), 500);
        d2 = new Drink("redbulllight", "redbull", 5.3, LocalDate.parse("2030-02-15"), 250);
        s1 = new Snack("Pombaer", "Baersnack", 3.2, LocalDate.parse("2020-03-03"), 300);
        s2 = new Snack("Snicker-white", "Snickers", 3.2, LocalDate.parse("2035-03-03"), 100);

        l1 = new Lighter("large-lighter", "big", 2.5, 200);
        c1 = new Cigarettes("Marlboro gold", "Marlboro", 9.90, 9.9);

        vendingitems.add(d1);
        vendingitems.add(d2);
        vendingitems.add(s1);
        vendingitems.add(s2);
        vendingitems.add(l1);
        vendingitems.add(c1);

    }

    // stillgood() from Consumable class
    @Test
    void sg_drink_no() {
        assertEquals("2020-02-13", d1.stillgood());
    }
    @Test
    void sg_drink_yes() {
        assertEquals("true", d2.stillgood());
    }
    @Test
    void sg_snack_no() {
        assertEquals("2020-03-03", s1.stillgood());
    }
    @Test
    void sg_snack_yes() {
        assertEquals("true", s2.stillgood());
    }

    // stillgood() form Vending_item class
    @Test
    void sg_lighter_yes() {
        assertEquals("true", l1.stillgood());
    }
    @Test
    void sg_cigarettes_yes() {
        assertEquals("true", c1.stillgood());
    }




}