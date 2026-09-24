package abs2;

public abstract class Employee {
   
    String name;
    int employeeID;
    
    Employee(String name, int employeeID){
        this.name = name;
        this.employeeID = employeeID;
    }
    abstract void work();
    
}




