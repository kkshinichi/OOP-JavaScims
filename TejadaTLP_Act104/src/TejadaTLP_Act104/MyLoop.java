/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB ACTIVITY 104 - BASIC JAVA PROGRAMMING

@author Theo Leonard Tejada
*/
package TejadaTLP_Act104;

import javax.swing.*;

public class MyLoop extends javax.swing.JFrame {
    MyLoop() {
        String pword, pword2;
    
        pword = JOptionPane.showInputDialog("Register your password : ");
    
        JPasswordField varA = new JPasswordField();
    
        String flag = "F";
        int wew;

        do {
            wew = JOptionPane.showConfirmDialog(null, varA, "Enter your password : ",JOptionPane.OK_CANCEL_OPTION);
            pword2 = new String(varA.getPassword());

            if (wew == JOptionPane.OK_OPTION) {
                if(pword2.equals(pword)) {
                    flag = "T";
                    JOptionPane.showMessageDialog(null, "Congratulations, access granted.");
                    // System.out.println("Congratulations, access granted.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Access Denied.");
                    // System.out.println("Access Denied.");
                }
            }
            else if (wew == JOptionPane.CANCEL_OPTION)
                System.exit(0);
            else
                System.exit(0);
    
        } while(flag.equals("F"));
    }
}