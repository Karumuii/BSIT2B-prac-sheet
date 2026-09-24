package P3.v2;


public class PIS {
   private String prodName;
   private String prodCode;
   private double price = 25;
   private int quant = 5;
   
   public PIS(String prodName, String prodCode){
       this.prodName = prodName;
       this.prodCode = prodCode;
//       updateprice(price);
//       updatequant(quant);
      
   }
   public String getName(){
       return prodName;
   }
   public String getCode(){
       return prodCode;
   }
   public double getPrice(){
       return price;
   }
   public int getQuan(){
       return quant;
   }
   
//   public void setName(String prodName){
//       this.prodName = prodName;
//   }
//   public void setProdCode(String prodCode ){
//       this.prodCode = prodCode;
//   }
   public void updateprice(double newprice){
       if (newprice < price){ // or >= 0 then this.price 
           System.out.println("Invalid");
       } else {
           this.price = newprice;
           System.out.println("After Updating the Price: " + price + "\n");
       }
   }
   public void updatequant(int newquan){
       if (newquan < quant){
           System.out.println("Invalid");
       } else {
           this.quant = newquan;
           System.out.println("After Updating the Quantity: " + quant + "\n");
       }
   }
   public double calctotal (){
       return price * quant;
   }
   
   public void display(){
       System.out.println("Name:" + prodName);
       System.out.println("Code:" + prodCode);
       System.out.println("Price:" + getPrice());
       System.out.println("Quantity:" + getQuan());
       System.out.println("Total: " + calctotal());
       System.out.println();
   }
}




