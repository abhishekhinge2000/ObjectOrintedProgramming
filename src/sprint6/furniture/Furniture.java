//Sprint:- 6 Ass No:- 2
//Furniture management System

package sprint6.furniture;

public class Furniture {
    private String type;
    private String color;
    private String grade;
    private String use; // Indoor or Outdoor
    private double price;

    public Furniture(String type, String color, String grade, String use, double price){
        this.type = type;
        this.color = color;
        this.grade = grade;
        this.use = use;
        this.price = price;
    }
    public double calculateFinalPrice(){
        if(use.equalsIgnoreCase("Outdoor")){
            return price - (price * 0.05); // 5% discount
        }
        return price;
    }
    public void displayDetails(){
        System.out.println("------Furniture Details-------");

        System.out.println("Type  :" +type);
        System.out.println("Color :" +color);
        System.out.println("Grade  :" +grade);
        System.out.println("Use    :" +use);
        System.out.println("Price   :" +price);

        System.out.println("FinalPrice  :"  +calculateFinalPrice());

        System.out.println("-----------------------------------");
    }

}
