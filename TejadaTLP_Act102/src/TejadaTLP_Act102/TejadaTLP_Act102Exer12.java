/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 12 — SUM OF EACH ROW

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.io.*;

public class TejadaTLP_Act102Exer12 {
    public static void main(String[] args) throws IOException {
        int[][] data = {
            {3, 2, 5},
            {1, 4, 4, 8, 13},
            {9, 1, 0, 2},
            {0, 2, 6, 3, -1, -8}
        };

        // declare the sum
        int sum;
        String b = "";

        // compute the sums of each row
        for(int row = 0; row < data.length; row++) {
            sum = 0;
            for(int col = 0; col < data[row].length; col++) {
                sum += data[row][col];
            }
            b += ("The sum for row " + (row + 1) + " is: " + sum + "\n");
        }

        System.out.println(b);
    }
}
