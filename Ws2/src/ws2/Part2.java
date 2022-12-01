
package ws2;

import cong.util.MyToys;


public class Part2 {
    public static void main(String[] args) {
        
        String id = MyToys.getID("Input the string: ", "The string is invalid"
                                    , "^(SE)\\d{3}$");
        System.out.println("The string is: " + id);
    }
    
    
}
