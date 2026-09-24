package P3.v2;

public class Main {
    public static void main(String[] args) {
         
       PIS p = new PIS("Remn", "78");
       
       p.display();
       
       p.updateprice(30);
       p.updatequant(10);
       
       p.calctotal();
       
       p.display();
         
         
    }
}
