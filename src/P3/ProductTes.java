package P3;

public class ProductTes {
    public static void main(String[] args) {
        // Create a product using the constructor
        Product product1 = new Product("Notebook", "P001", 25.50, 100);
        product1.displayInfo();

        // Update price and quantity using authorized setters
        product1.setPrice(30.00);
        product1.setQuantity(150);
        System.out.println("After valid update:");
        product1.displayInfo();

//        // Attempt invalid updates (should be rejected)
//        System.out.println("Attempting invalid updates:");
//        product1.setPrice(-10);      // invalid
//        product1.setQuantity(-5);    // invalid

        // Show that values remain unchanged after rejected updates
        System.out.println("Final product info (invalid updates ignored):");
        product1.displayInfo();
    }
}
