
package ws1;

import cong.util.MyToys;
import java.util.Scanner;


public class Part3 {
    public static void main(String[] args) {
        int count ;
        Scanner sc = new Scanner(System.in);
        count = MyToys.getAnInteger("How many student's name do you want to input: ", "an integer please ", 0, 500);
        String studentName[] = new String[count];
        
        for (int i = 0; i < count; i++) {
            System.out.printf("Input the %d/%d student's name: ",i+1 ,count);    
            studentName[i] = sc.nextLine();
                
            
              
        }
        System.out.println("The list of student's name:");
        for (int i = 0; i < count; i++) {
            
            System.out.println((i + 1) +". " + studentName[i].trim().toUpperCase());
        }
       
    }
}
