package P4;

public class PDS {

    private String prodName;
    private double price;
    private int quant;
    private double deduction;

    public PDS(String name, double price, int quant) {
        this.prodName = prodName;
        this.price = price;
        this.quant = quant;
    }

    public void validation(double price, double deduction) {
        if (price < 1000) {
            System.out.println("no discount");
            this.price = price;
        } else if (price >= 1000 && price <= 4999) {
            deduction = 0.5;
            System.out.println("Discounted 5%");
            double f5 = price * deduction;
        } else if (price >= 5000 && price < 9999) {
            deduction = 0.10;
            System.out.println("Discounted 10%");
            double f10 = price * deduction;
        }
    }
    void display(){
        System.out.println("Name: " + prodName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quant);
    }
}


