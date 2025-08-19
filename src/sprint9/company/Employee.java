//1. Create an Employee class to be default and make its members protected so that only
//Subclasses within the package can access them.
//2. Create an Manager class that inherits from employee and adds a department field. Implement
// a method to display the manager's details using the protected members.

package sprint9.company;

public class Employee {  //Default class - not accessible outside company package
    protected String name;
    Employee(String name){
        this.name = name;
    }
    protected void showDetails(){ //Protected method
        System.out.println("Employee Name: " +name);

    }
}
