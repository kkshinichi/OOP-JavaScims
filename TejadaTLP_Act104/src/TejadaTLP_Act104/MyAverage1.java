/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB ACTIVITY 104 - BASIC JAVA PROGRAMMING

@author Theo Leonard Tejada
*/
package TejadaTLP_Act104;

import javax.swing.*;

public class MyAverage1 {
    public static void main(String[] args) {
        double q1, q2, q3/*, ave*/;

        q1 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ1 : "));
        q2 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ2 : "));
        q3 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ3 : "));

        JOptionPane.showMessageDialog(null, "(" + q1 + " + " + q2 + " + " + q3 + ") / 3  = " + ((q1 + q2 + q3) / 3));

    }
}
