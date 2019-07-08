/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LIVE EXERCISE 03 — GCF

@author Theo Leonard Tejada
*/

package tejadatlp_liveexer03;

import java.util.*;

public class TejadaTLP_LiveExer03 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = numbers.nextInt();
        System.out.println("Enter second number: ");
        int n2 = numbers.nextInt();
        // Always set to positive
        n1 = (n1 > 0) ? n1 : -n1;
        n2 = (n2 > 0) ? n2 : -n2;
        while(n1 != n2) {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("GCF = " + n1);
    }
    
}
