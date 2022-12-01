
package ws1;

import cong.util.MyToys;
import java.util.Scanner;


public class Part1 {

   
    public static void main(String[] args) {
        int rows, columns, matrix[][];
        rows = MyToys.getAnIntegerGreater("Input number of row: ", "Please input an integer", 0 );
        columns = MyToys.getAnIntegerGreater("Input number of column: ", "Please input an integer", 0 );
        matrix = new int [rows][columns];
        System.out.print("Input matrix: \n");
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < columns; j++) {
                System.out.print("m[" + i + "][" + j + "]=");
                matrix[i][j] = MyToys.getAnInteger("", "Please Input an integer"); 
            }
        
        System.out.println("Matrix inputted: ");
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < columns; j++)
                System.out.printf("%3d\n",matrix[i][j]);     
        int sum = 0;
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < columns; j++) 
                sum = sum + matrix[i][j];
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double)sum / (rows*columns));    
        
    }
}
