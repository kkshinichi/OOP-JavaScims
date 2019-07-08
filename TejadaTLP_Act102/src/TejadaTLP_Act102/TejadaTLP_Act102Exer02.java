/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 2 — TWO ARRAYS

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.util.*;

public class TejadaTLP_Act102Exer02 {
    public static void main(String[] args) {
        int[] val = {13, -4, 82, 17};
        int[] twice;
        int i = 0;

        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        // Construt an array object for twice.
        twice = new int[val.length];

        // Put values in twice that are twice the corresponding values in val.
        while(i < val.length) {
            twice[i] = val[i]; i++;
        }

        System.out.println("New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
    }
}
