/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 10 — DATA TWEAKER (LONG)

@author Theo Leonard Tejada

Shell command: java TejadaTLP_Act12Exer10 < phread.txt
*/
package TejadaTLP_Act102;

import java.io.*;
import java.util.Scanner;

public class TejadaTLP_Act102Exer10 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        System.out.println("Enter the amount of data: "+x);
        if (x==null){
            System.exit(0);
        }

        int amount = Integer.parseInt(x);
        double sum=0,ave,temp=0,distant=0, newave;
        double[] data={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                       0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int count=0;
        String a="";
        while (count < amount){
            String z = input.next();
            System.out.println("data[" + count + "]="+z);
            data[count] = Double.parseDouble(z);
            count++;
            z += ("");
        }
        for(int i = 0; i < amount; i++) {
            sum += data[i];
        }
        ave = sum / amount;
        a += ("\n" + "AVERAGE: " + ave);
        for(int i = 0; i < amount; i++) {
            temp = Math.abs(data[i] - ave);
            if (temp >= distant) {
                distant = data[i];
            }
        }
        a += ("\n" + "MOST DISTANT: " + distant);
        newave = (sum - distant) / (amount - 1);
        a += ("\n" + "NEW AVERAGE: " + newave);
        System.out.println(a);
    }    
}
