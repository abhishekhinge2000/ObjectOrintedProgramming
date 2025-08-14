package sprint6.furniture;

public class FurnitureStore {
    public static void main(String[] args){
        Furniture f1 = new Furniture("Chair", "Red", "Grade 1", "Outdoor", 1500);
        Furniture f2 = new Furniture("Table", "Blue", "Grade 2", "Indoor", 2500);
        Furniture f3 = new Furniture("Stool", "Green", "Grade 3", "Outdoor", 800);

        f1.displayDetails();
        f2.displayDetails();
        f3.displayDetails();
    }
}
