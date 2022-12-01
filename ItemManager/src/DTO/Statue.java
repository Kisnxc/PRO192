
package DTO;

import cong.util.MyToys;
import java.util.Scanner;


public class Statue extends Item {
    private int weight;
    private String color;
    
    public Statue(){
    }

    public Statue(int value, String creator, int weight, String color) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }
    

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void outputStatue(){
        System.out.println("Statue:");
        output();
        System.out.println("Weight: " + weight + "; Color: " + color);
    }
    
    public void inputStatue(){
        System.out.println("Input a Statue"); 
        input();
        Scanner sc = new Scanner(System.in);              
        weight = MyToys.getAnInteger("Input weight: ", "Input an integer");
        System.out.print("Input color: ");
        color = sc.nextLine();
    }
}
