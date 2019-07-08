/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 14 — MAXIMUM AND MINIMUM ELEMENTS

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.io.*;

public class TejadaTLP_Act102Exer14 {
    public static void main(String[] args) throws IOException{
        int[][] data = {
            {3, 2, 5, 0, 0, 0},
            {1, 4, 4, 8, 13},
            {9, 1, 0, 2, 0, 0},
            {0, 2, 6, 3, -1, -8}
        };
        // declare the max and min
        int max = 0, min = 0, sum = 0, x = 0;
    
        // compute the sum
        for(int row = 0; row < data.length; row++) {
            for(int i = 0; i < data[row].length; i++) {
                if(data[row][i] > max) {
                    max = data[row][i];
                    x = row;
                }
            }
        }
        for (int col = 0; col < data.length; col++) {
            for(int j = 0; j < data[col].length; j++) {
                if(data[col][j] > max) {
                    min = data[col][j];
                    x = col;
                }
            }
        }

        sum = max + min;

        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
        System.out.println("The sum of min and max values is " + sum);
    }
}
