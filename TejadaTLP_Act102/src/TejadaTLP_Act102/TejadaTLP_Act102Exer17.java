/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 17 — IMAGE SMOOTER(LONG)

@author Theo Leonard Tejada
*/
package TejadaTLP_Act102;

import java.io.*;

public class TejadaTLP_Act102Exer17 {
    public static void main(String[] args) throws IOException {
        String d = "", e = "";
        d += ("\nImage Smoother");
        int[][] image = {
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0}
        };
        int sum;
        int[][] smooth = new int[image.length][image[0].length];

        for (int r = 1; r < image.length - 1; r++) {
            sum=0;
            for (int c = 1; c < image[r].length - 1; c++) {
                sum = image[r-1][c-1]+ image[r-1][c ]+ image[r-1][c+1]+
                image[r][c-1]+ image[r][c ]+ image[r ][c+1]+
                image[r+1][c-1]+ image[r+1][c ]+ image[r+1][c+1];

                smooth[r][c] = sum/9;
            }
        }
        d += ("\n\nIMAGE:\n");
        for (int i=0;i<image.length;i++) {
            for(int j=0;j<image[i].length;j++) {
                d += (image[i][j]+" ");
            }
            d += ("\n");
        }
        e += ("\n\nSMOOTH: "+"\n");

        for (int i=0;i<image.length;i++) {
            for(int j=0;j<image[i].length;j++) {
                e += (smooth[i][j]+" ");
            }
            e+=("\n");
        }
        System.out.println(d + e);
    }
}
