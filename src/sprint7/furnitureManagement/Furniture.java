//Sprint 7 ex: 2

package sprint7.furnitureManagement;

import java.util.concurrent.RecursiveTask;

public class Furniture {

    //Fields (Encapsulation - keep private)
    private String type;  //Table, Chair etc
    private String color; //Red, blue, green
    private String grade; //grade1, grade2, grade3

    private boolean isOutdoor; // if true outdoor, if false indoor

    private double price; // base price

    //Final Discount(can not be change)
    private static final double DISCOUNT = 0.05;

    //Constructor
    public Furniture(String type, String color, String grade, boolean isOutdoor, double price){
        this.type = type;
        this.color = color;
        this. grade = grade;
        this. isOutdoor = isOutdoor;
        this. price = price;
    }

    //Getter and setter
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }

    public boolean isOutdoor(){
        return isOutdoor;
    }
    public void setOutdoor(boolean outdoor){
        isOutdoor = outdoor;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //Calculate final price with discount if outdoor
    public double calculateDiscount(){
        if(isOutdoor){
            return price - (price * DISCOUNT);
        }
        return price;
    }

    //Display details
    public void displayDetails(){
        System.out.println("Furniture Type: " + type);
        System.out.println("color: " + color);
        System.out.println("Grade: " + grade);
        System.out.println("Usage: " + (isOutdoor ? " outdoor" : " indoor") );
        System.out.println("Original Price: " + price);

        System.out.println("FinalPrice: " + calculateDiscount() );

        System.out.println("-------------------------------------------");
    }
}
