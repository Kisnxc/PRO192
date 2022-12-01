

package DTO;

import java.util.Scanner;
import cong.util.MyToys;


public class Vase extends Item {
    private int height;
    private String material;
   
    public Vase(){   
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }
   
    

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void outputVase(){
        System.out.println("Vase:");
        output();
        System.out.println("Height: " + height + "; Material: " + material);
    }
    
    public void inputVase(){     
        System.out.println("Input a Vase ");
        input();        
        Scanner sc = new Scanner(System.in);      
        height = MyToys.getAnInteger("Input height: ", "Input an integer");
        System.out.print("Input material: ");
        material = sc.nextLine();
        
    }
    
}
