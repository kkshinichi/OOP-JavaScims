/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 13 — SUM OF EACH COLUMN

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.io.*;

public class TejadaTLP_Act102Exer13 {
    public static void main(String[] args) throws IOException {
        int[][] data = {
            {3, 2, 5, 0, 0, 0},
            {1, 4, 4, 8, 13, 0},
            {9, 1, 0, 2, 0, 0},
            {0, 2, 6, 3, -1, -8}
        };

        // declare the sum
        int sum = 0;
        String b = "";

        // compute the sums of each row
        for(int col = 0; col < data[1].length; col++) {
            sum = 0;
            for(int row = 0; row < data.length; row++) {
                sum += data[row][col];
            }
            b += ("The sum for column " + (col + 1) + " is: " + sum + "\n");
        }

        System.out.println(b);
    }
}
