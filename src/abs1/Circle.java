package abs1;

public class Circle extends Shape{
   
    private double radius;
    
//    public Circle(double radius) {
//        super("Circle");
//        this.radius = radius;
//    }
    
    public Circle (double radius){
        this.radius = radius;
    }
    
    @Override
    public double calcArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    void displayCircle(){
        System.out.println("Area of Rec: " + calcArea());
    }
    
}




