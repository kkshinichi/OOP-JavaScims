/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 4 — SAME SUM

@author Theo Leonard Tejada
*/

package TejadaTLP_Act102;

public class TejadaTLP_Act102Exer04 {
    public static void main(String[] args) {
        int[] valA = {13, -22, 82, 17};
        int[] valB = {0, 0, 0, 0}; // 12 47 -57 8
        int i = 0;

        //Put values into valB so that the sum of the values in corresponding slots of valA and valB is 25.

        do {
            valB[i] = 25 - valA[i]; i++;
        } while(i < valA.length);

        System.out.println("valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3]);
        System.out.println("valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);
        
        System.out.println("sum: " + (valA[0] + valB[0]) + " " + (valA[1] + valB[1]) + " " + (valA[2] + valB[2]) + " " + (valA[3] + valB[3]));
    }
}
