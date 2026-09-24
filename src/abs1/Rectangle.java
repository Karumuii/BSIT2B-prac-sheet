package abs1;

public class Rectangle extends Shape{
    
    private double length;
    private double width;

//   public Rectangle(double length, double width) {
//        super("Rectangle"); // sends the shape name up to the Shape class
//        this.length = length;
//        this.width = width;
//    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calcArea() {
         return length * width;
    }
    
    void displayRec(){
        System.out.println("Area of Rec: " + calcArea());
    }
}




