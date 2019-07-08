/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB ACTIVITY 104 - BASIC JAVA PROGRAMMING

@author Theo Leonard Tejada
*/
package TejadaTLP_Act104;

import javax.swing.*;

public class MyStringComp extends javax.swing.JFrame {
    MyStringComp() {
        String pword, pword2;
    
        pword = JOptionPane.showInputDialog("Register your password: ");
        pword2 = JOptionPane.showInputDialog("Enter your password: ");
    
        if(pword2.equals(pword))
            JOptionPane.showMessageDialog(null, "Congratulations, access granted.");
            // System.out.println("Congratulations, access granted.");
        else
            JOptionPane.showMessageDialog(null, "Access Denied.");
            // System.out.println("Access denied.");
    }
}
