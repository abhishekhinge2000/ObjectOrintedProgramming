package sprint9.company;

public class Manager extends Employee{
    private String department;
    Manager(String name, String department){
        super(name);
        this.department = department;
    }
    public void displayManagerInfo(){
        showDetails(); //Accessible (Protected)
        System.out.println("Department: " +department);
    }
}
