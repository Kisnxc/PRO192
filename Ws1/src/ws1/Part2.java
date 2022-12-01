
package ws1;

import cong.util.MyToys;
import java.util.Scanner;


public class Part2 {
    public static void main(String[] args) {
         double number1, number2;
        String op;
        Scanner sc = new Scanner(System.in);
        number1 = MyToys.getADouble("Input number 1: ", "Please input a number!!!");
        number2 = MyToys.getADouble("Input number 2: ", "Please input a number!!!");
        System.out.println("Input the operator (+ - * /): ");
        op = sc.nextLine();
        switch (op) {
            case "+": 
                System.out.println("The result of " + number1 + op + number2 + "=" + (number1+number2));
                break;
            case "-": 
                System.out.println("The result of " + number1 + op + number2 + "=" + (number1-number2));
                break;
            case "*": 
                System.out.println("The result of " + number1 + op + number2 + "=" + (number1*number2));
                break;
            case "/":
                if (number2 == 0)
                    System.out.println("Can not divide 0");
                else 
                    System.out.printf("The result of %.2f %s %.2f = %.2f\n", number1, op, number2, (number1/number2));
                break;
            default: 
                System.out.println("Op is not supported");
        }
    }
   
    
}
