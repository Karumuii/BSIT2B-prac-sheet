package P3;

public class Product {
    // Private fields - protected from direct access/modification
    private String productName;
    private String productCode;
    private double price;
    private int quantity;

    // Constructor
    public Product(String productName, String productCode, double price, int quantity) {
        this.productName = productName;
        this.productCode = productCode;
        setPrice(price);       // use setter so validation applies from the start
        setQuantity(quantity);
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters with validation (authorized way to modify price/quantity)
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid price! Price cannot be negative. Update rejected.");
            return;
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Invalid quantity! Quantity cannot be negative. Update rejected.");
            return;
        }
        this.quantity = quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    // Calculates total inventory value based on price and quantity
    public double getTotalInventoryValue() {
        return price * quantity;
    }

    // Display product details
    public void displayInfo() {
        System.out.println("Product Name    : " + productName);
        System.out.println("Product Code    : " + productCode);
        System.out.println("Price           : " + price);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Total Inventory Value : " + getTotalInventoryValue());
        System.out.println("---------------------------------------------------");
    }
}




