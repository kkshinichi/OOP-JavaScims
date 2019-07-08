/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LIVE EXERCISE 02 — Check Writer

@author Theo Leonard Tejada
*/

package tejadatlp_liveexer02;

import java.io.*;
import java.math.*;
import java.util.*;
import java.text.Format.*;

public class TejadaTLP_LiveExer02 {
    private static final String[] placeHolder = {
        "",
        "THOUSAND ",
        "MILLION "
    };
    private static final String[] tens = {
        "",
        "TEN ",
        "TWENTY ",
        "THIRTY ",
        "FORTY ",
        "FIFTY ",
        "SIXTY ",
        "SEVENTY ",
        "EIGHTY ",
        "NINETY "
    };
    private static final String[] digits = {
        "",
        "ONE ",
        "TWO ",
        "THREE ",
        "FOUR ",
        "FIVE ",
        "SIX ",
        "SEVEN ",
        "EIGHT ",
        "NINE ",
        "TEN ",
        "TEN ",
        "ELEVEN ",
        "TWELVE ",
        "THIRTEEN ",
        "FOURTEEN ",
        "FIFTEEN ",
        "SIXTEEN ",
        "SEVENTEEN ",
        "EIGHTTEEN ",
        "NINETEEN "
    };

    private String lessThanAThousand(int number) {
        String current;
        if (number % 100 < 20){
            current = digits[number % 100];
            number /= 100;
        }
        else {
            current = digits[number % 10];
            number /= 10;

            current = tens[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return digits[number] + "HUNDRED " + current;
    }

    public String convert(int number) {
        if(number == 0)
            return "ZERO";
        String current = "";
        int place = 0;

        do {
            int n = number % 1000;
            if (n != 0) {
                String s = lessThanAThousand(n);
                current = s + placeHolder[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);

        return (current).trim();
    }

    public static void main(String[] args) throws IOException{
        Scanner inputs = new Scanner(System.in);
        TejadaTLP_LiveExer02 obj = new TejadaTLP_LiveExer02();
        System.out.println("PAY IN THE ORDER OF:");
        String name = inputs.nextLine();
        System.out.println("DATE (MM/DD/YYYY):");
        String date = inputs.nextLine();
        System.out.println("AMOUNT:");
        double amt = inputs.nextDouble();
        System.out.println("\n\n" + name + "\t\t\t\t" + date);
        // System.out.println(obj.convert(amt));

        BigDecimal bigDecimal = new BigDecimal(String.valueOf(amt));
        int peso = bigDecimal.intValue(); //extracted
        var cents = bigDecimal.subtract(new BigDecimal(peso)).movePointLeft(-2);
        System.out.println(obj.convert(peso) + " AND " + cents + "/100 PESOS"); //operation
    }
}