/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 6 — SUM OF EVEN, ODD, AND ALL ELEMENTS

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.io.*;

public class TejadaTLP_Act102Exer06 {
    public static void main(String[] args) throws IOException {
        int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
        int even = 0, odd = 0, sum = 0;

        // declare and initialize three sums

        // compute the sums
        for(int index = 0; index < data.length; index++) {
            if(index % 2 == 1) {
                odd += data[index];
            }
            else if(index % 2 == 0) {
                even += data[index];
            }
            sum += data[index];
        }

        // write out the three sums
        System.out.println("Sum of odd:\t" + odd);
        System.out.println("Sum of even:\t" + even);
        System.out.println("Sum of all:\t" + sum);
    }    
}
