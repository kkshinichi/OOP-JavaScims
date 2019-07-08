/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 15 — LARGEST ELEMENTS

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.io.*;

public class TejadaTLP_Act102Exer15 {
    public static void main(String[] args) throws IOException{
        int[][] data = {
            {3, 2, 5, 0, 0, 0},
            {1, 4, 4, 8, 13},
            {9, 1, 0, 2, 0, 0},
            {0, 2, 6, 3, -1, -8}
        };
        // declare the max and min
        int max = data[0][0];
    
        // compute the sum
        for(int row = 0; row < data.length; row++) {
            max = 0;
            for(int col = 0; col < data[1].length; col++) {
                if(data[row][col] > max) {
                    max = data[row][col];
                }
            }
            System.out.println("Largest number in row [" + (row + 1) + "] is " + max);
        }
    }    
}
