/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 3 — THREE ARRAYS

@author Theo Leonard Tejada
*/

package TejadaTLP_Act102;


public class TejadaTLP_Act102Exer03 {
    public static void main(String[] args) {
        int[] valA = {13, -22, 82, 17};
        int[] valB = {-12, 24, -79, -13};
        int[] sum = {0, 0, 0, 0};
        int i = 0;

        // Add values from corresponding slots for valA and valB and put the result in the corresponding slot of sum.
        do {
            sum[i] = valA[i] + valB[i]; i++;
        } while (i < sum.length);

        System.out.println("sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]);
    }
}
