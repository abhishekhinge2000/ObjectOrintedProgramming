package sprint7.furnitureManagement;

public class FurnitureTest {
    public static void main(String[] args){

        //Example Object
        Furniture chair = new Furniture("Chair", "Red", "Grade1", true, 1000);

        Furniture table = new Furniture("Table", "Yellow", "Grade2", false, 1500);

        chair.displayDetails();
        table.displayDetails();
    }
}
