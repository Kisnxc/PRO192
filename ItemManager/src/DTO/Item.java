
package DTO;

import cong.util.MyToys;
import java.util.Scanner;


public class Item {
    protected int value;
    protected String creator;
    public Item(){
    }
    
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input(){        
        
        value = MyToys.getAnIntegerGreater("Input value: ", "Value must be greater 0", 0);
        creator = MyToys.getString("Input Creator: ", "Creator is not empty");
    }
    public void output(){
        System.out.println("Value: " + value + "; Creator: " + creator);      
    }
    
    
    
}
