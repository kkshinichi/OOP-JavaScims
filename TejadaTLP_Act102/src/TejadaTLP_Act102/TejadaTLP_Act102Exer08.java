/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 8 — REVERSAL OF ELEMENTS

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.io.*;

public class TejadaTLP_Act102Exer08 {
    public static void main(String[] args) throws IOException {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int k = data.length;
        int[] result = new int[data.length];

        // copy the data in reversed order to result
        System.out.print("Array in original order: ");
        for (int j = 0; j < data.length; j++) {
            if(j != data.length - 1)
                System.out.print(data[j] + ", ");
            else
                System.out.print(data[j]);
            result[k-1] = data[j]; k--;
        }

        // write out the result
        System.out.print("\nArray in reversed order: ");
        for (int j = 0; j < result.length; j++) {
            if(j != result.length - 1)
                System.out.print(result[j] + ", ");
            else
                System.out.print(result[j] + "\n");
        }
    }
}
