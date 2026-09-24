package P4.v2;

public class Main {

    public static void main(String[] args) {

        // Below P1,000 - no discount
        Pds p1 = new Pds("Notebook", 50, 10); // subtotal = 500
        p1.display();

        //  P1,000 to P4,999 - 5% discount
        Pds p2 = new Pds("Bag", 300, 10); // subtotal = 3000
        p2.display();

        //  P5,000 to P9,999 - 10% discount
        Pds p3 = new Pds("Shoes", 1500, 5); // subtotal = 7500
        p3.display();

        //  P10,000 or more - 15% discount
        Pds p4 = new Pds("Laptop", 20000, 1); // subtotal = 20000
        p4.display();

        //  invalid price and quantity
        Pds p5 = new Pds("Pen", -10, 0);
        p5.display();

    }
}
