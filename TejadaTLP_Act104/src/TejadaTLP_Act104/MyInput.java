/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB ACTIVITY 104 - BASIC JAVA PROGRAMMING

@author Theo Leonard Tejada
*/
package TejadaTLP_Act104;

import javax.swing.*;

public class MyInput {
    public static void main(String[] args) {
        String name;

        name = JOptionPane.showInputDialog("Enter name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        // System.out.println("Hello " + name);

        String input;
        input = JOptionPane.showInputDialog("How old are you : ");

        int age, year;
        age = Integer.parseInt(input);

        year = (2019 - age);
        JOptionPane.showMessageDialog(null, "You were born in " + year);
        // System.out.println("You were born in "  + year);
    }
}