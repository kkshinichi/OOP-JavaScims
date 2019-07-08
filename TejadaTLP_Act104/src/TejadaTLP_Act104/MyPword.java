/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB ACTIVITY 104 - BASIC JAVA PROGRAMMING

@author Theo Leonard Tejada
*/
package TejadaTLP_Act104;

import javax.swing.*;

public class MyPword {
    public static void main(String[] args) {
        String pword, pword2;

        pword = JOptionPane.showInputDialog("Register your password : ");

        JPasswordField varA = new JPasswordField();
        JOptionPane.showConfirmDialog(null, varA, "Enter your password : ",JOptionPane.OK_CANCEL_OPTION);

        pword2 = new String(varA.getPassword());

        if(pword2.equals(pword))
            System.out.println("Congratulations, access granted.");
        else
            System.out.println("Access Denied.");
    }   
}