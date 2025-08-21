package sprint6.Constructor;

public class Employee {
    String name;
    int id;
    String department;
    double salary;

    //no constructor define

    void displayDetails(){
        System.out.println("Name: " + name );
        System.out.println("Department: " + department);
        System.out.println("Salary: " +salary);
    }
}
