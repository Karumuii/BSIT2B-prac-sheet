package P1;
class Student{
    String name, address, depart;
    int age, ID;
    
    void diso(){
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + ID);
        System.out.println("Age: " + age);
        System.out.println("Department: " + depart);
        System.out.println("Address: " + address);
    }
}
public class p1 {
    public static void main(String[] args) {
         
         Student c1 = new Student();
         Student c2 = new Student();
         
         c1.name = "Hello";
         
         
    }
}
