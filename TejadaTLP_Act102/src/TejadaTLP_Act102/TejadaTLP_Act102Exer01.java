/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 1 — ARRAY SUM

@author Theo Leonard Tejada
*/

package TejadaTLP_Act102;

import java.util.*;

public class TejadaTLP_Act102Exer01 {
    public static void main(String[] args) {
        int[] val = {0,1,2,3};
        int sum = Arrays.stream(val).sum();
        System.out.println("Sum of all numbers = " + sum);
    }
}