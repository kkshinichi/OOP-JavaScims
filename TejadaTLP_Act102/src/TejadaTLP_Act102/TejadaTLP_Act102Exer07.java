/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 7 — TWO LARGEST ELEMENTS

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.io.*;

public class TejadaTLP_Act102Exer07 {
    public static void main(String[] args) throws IOException {
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

        // declare and initialize values for the two largest
        int tempA = Integer.MIN_VALUE, tempB = Integer.MIN_VALUE;

        // compute for the two largest
        for(int value : data) {
            if(value > tempA) {
                tempB = tempA;
                tempA = value;
            } else if (value > tempB) {
                tempB = value;
            }
        }
        

        // write out the two largest
        System.out.println("Two Largest Elements are " + tempA + " and " + tempB + ".");
    }
}
