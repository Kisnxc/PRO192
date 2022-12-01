
package ws2;

import cong.util.MyToys;


public class Part1 {
    public static void main(String[] args) {
        int number;
        number = MyToys.getAnIntegerGreater("Input a number: ", "The number is invalid", 1 );
        System.out.println("The number is: " + number);
    }
    
}
