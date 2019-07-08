/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 9 — SIGNAL SMOOTHER

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.io.*;

public class TejadaTLP_Act102Exer09 {
    public static void main(String[] args) throws IOException {
        int[] signal = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
        int[] smooth;

        // compute for the smoothed value for each slot of the array smooth
        smooth = new int[signal.length];
        smooth[0] = (signal[0] + signal[1]) / 2;
        smooth[signal.length - 1] = (signal[signal.length - 1] + signal[signal.length - 2]) / 2;
        for (int i = 1; i < signal.length - 1; i++) {
            smooth[i] = (signal[i-1] + signal[i] + signal[i+1]) / 3;
        }

        // write out the input
        System.out.print("Signal:\t");
        for (int j = 0; j < smooth.length; j++) {
            System.out.print(signal[j] + " ");
        }

        // write out the result
        System.out.print("\nSmooth:\t");
        for (int j = 0; j < smooth.length; j++) {
            System.out.print(smooth[j] + " ");
        }
    }
}
