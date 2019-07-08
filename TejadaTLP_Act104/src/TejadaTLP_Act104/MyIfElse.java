/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB ACTIVITY 104 - BASIC JAVA PROGRAMMING

@author Theo Leonard Tejada
*/
package TejadaTLP_Act104;

import javax.swing.*;

public class MyIfElse {
    public static void main(String[] args) {
        int q1, q2, q3, ave;
        q1 = Integer.parseInt(JOptionPane.showInputDialog("Enter LQ1 : "));
        q2 = Integer.parseInt(JOptionPane.showInputDialog("Enter LQ2 : "));
        q3 = Integer.parseInt(JOptionPane.showInputDialog("Enter LQ3 : "));
        ave = (q1 + q2 + q3) /3;

        String remarks;

        if((ave >= 80) && (ave <= 100))
            remarks = "Excellent";
        else if ((ave >= 60) && (ave <= 79))
            remarks = "Fair";
        else if ((ave >= 0) &&  (ave <= 59))
            remarks = "Fail";
        else
            remarks = "Illegal Grade";

        JOptionPane.showMessageDialog(null, "(" + q1 + " + " + q2 + " + " + q3 + ") / 3  = " + ((q1 + q2 + q3) / 3) + "\n" + remarks);
        // System.out.println("(" + q1 + " + " + q2 + " + " + q3 + ") / 3  = " + ((q1 + q2 + q3) / 3));
        // System.out.println(remarks);
    }
}
