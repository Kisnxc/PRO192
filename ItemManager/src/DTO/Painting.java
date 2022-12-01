
package DTO;

import cong.util.MyToys;
import java.util.Scanner;


public class Painting extends Item {
    private int height;
    private int weight;
    private boolean isWatercolor;
    private boolean isFramed;
    
    public Painting(){
       
    }

    public Painting(int value, String creator, int height, int weight, boolean isWatercolor, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.weight = weight;
        this.isWatercolor = isWatercolor;
        this.isFramed = isFramed;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isIsWatercolor() {
        return isWatercolor;
    }

    public void setIsWatercolor(boolean isWatercolor) {
        this.isWatercolor = isWatercolor;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void outputPainting(){
        System.out.println("Painting:");
        output();       
        System.out.println("Height: " + height + "; Weight: " + weight + "; isWatercolor: " + isWatercolor + "; isFramed: " + isFramed);
    }
    
    public void inputPainting(){
        System.out.println("Input a Painting ");
        input();
        Scanner sc = new Scanner(System.in);
        height = MyToys.getAnInteger("Input height: ","Input an integer");
        weight = MyToys.getAnInteger("Input weight: ","Input an integer");
        System.out.print("isWatercolor(true/false): ");
        isWatercolor = sc.nextBoolean();
        System.out.print("isFramed(true/false): ");
        isFramed = sc.nextBoolean();
    }
    
}
