package abs2;

public class Technician extends Employee {
   Technician(String name, int employeeID){
       super(name, employeeID);
   }

    @Override
    void work() {
        System.out.println("Name: " + name + "(ID: " + employeeID + ") is working");
    }
    
    
}




