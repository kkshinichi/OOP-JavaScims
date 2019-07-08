/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 11 — SUM OF ALL ARRAY ELEMENTS

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

public class TejadaTLP_Act102Exer11 {
    public static void main(String[] args) {
        int[][] data = {
            {3,2,5,0,0,0},
            {1,4,4,8,13,0},
            {9,1,0,2,0,0},
            {0,2,6,3,-1,-8}
        };
        int sum = 0;

        for ( int row = 0; row < data.length; row++) {
            for ( int col=0; col < data[1].length; col++) {
                sum += data[row][col];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
