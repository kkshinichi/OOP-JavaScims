/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 16 — REVERSAL OF ELEMENTS IN EACH ROW

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.io.*;

public class TejadaTLP_Act102Exer16 {
    public static void main(String[] args) throws IOException {
        String x = "", y = "", z = "";
        x += ("Reversal of elements in Each Row\n");
        int[][] data = {
            {3, 2, 5},
            {1, 4, 4, 8, 1},
            {9, 1, 0, 2},
            {0, 2, 6, 3, -1, -8}
        };

        y += ("Original Array");
        for (int i = 0; i < data.length; i++) {
            y += ("\ndata[" + (i + 1) + "] = ");
            for (int j = 0; j < data[i].length; j++) {
                y += (data[i][j] + "  ");
            }
            y += ("");
        }

        z += ("\n\nReversed Array:\n");
        for(int i = 0; i < data.length; i++) {
            for (int j = data[i].length-1; j >= 0; j--) {
                z += (data[i][j] + " ");
            }
            z += ("\n");
        }

        System.out.println(x + y + z);
    }    
}
