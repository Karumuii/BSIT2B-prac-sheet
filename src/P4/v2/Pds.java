package P4.v2;

public class Pds {

    private String name;
    private double price;
    private int quant;
    private double discount;

    public Pds(String name, double price, int quant) {
        this.name = name;
        setPrice(price);
        setQuant(quant);
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Invalid price");
        } else {
            this.price = price;
        }
    }

    public void setQuant(int quant) {
        if (quant <= 0) {
            System.out.println("Invalid quantity value");
        } else {
            this.quant = quant;
        }
    }

    public String getName() {
        return name;
    }

    public double getPice() {
        return price;
    }

    public int getQuant() {
        return quant;
    }

    public double getDisc() {
        return discount;
    }

    public double getFinal() {
        double total = price * quant;

        if (total < 1000) {
            discount = 0;
        } else if (total >= 1000 && total <= 4999) {
            discount = 0.05;
        } else if (total > 5000 && total <= 9999) {
            discount = 0.10;
        } else if (total >= 10000) {
            discount = 0.15;
        }
        return total - (total * discount);
        
    }

    public void display() {
        double g = getFinal();
        double total = price * quant;
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quant);
        System.out.println("Total price: " + total);
        System.out.println("Discount: P" + g);
       System.out.println("Discount: " +  discount + "%");
       System.out.println("% of Final Pay: " + (g * discount));
    
       
        System.out.println();
}
    }


