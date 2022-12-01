
package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import cong.util.MyToys;
import java.util.Scanner;


public class AntiqueShop {
    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Create a Vase");
            System.out.println("2. Create a Statue");
            System.out.println("3. Create a Painting");
            System.out.println("4. Display the item");
            System.out.println("5. Exit");
            choice = MyToys.getAnInteger("Input a choice: ", "Number please");
            switch(choice){
                case 1: item = new Vase();
                        ((Vase)item).inputVase();
                        break;        
                case 2: item = new Statue();
                        ((Statue)item).inputStatue();
                        break;
                case 3: item = new Painting();
                        ((Painting)item).inputPainting();
                        break;
                case 4: if(item != null){ 
                            if(item instanceof Vase)
                                ((Vase)item).outputVase();
                            else if(item instanceof Statue)
                                ((Statue)item).outputStatue();
                            else if(item instanceof Painting)
                                ((Painting)item).outputPainting();
                        }
                        else System.out.println("You need to create an obbject");
                        break;
                case 5: 
                    break;
                default: System.out.println("Choose number 1..5");    
            } 
        } while (choice != 5);
    }
}
