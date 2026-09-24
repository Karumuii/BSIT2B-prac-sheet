package abs1;

public class Main {
    public static void main(String[] args) {
         
//         Shape[] shapes = {
//            new Rectangle(10, 5),
//            new Circle(7)
//        };
//         
//         for (Shape shape : shapes) {
//            shape.displayArea();
//        }
         

        Rectangle r = new Rectangle (6, 7);
        r.displayRec();
         
        Circle c = new Circle(6);
         c.displayCircle();
    }
}
