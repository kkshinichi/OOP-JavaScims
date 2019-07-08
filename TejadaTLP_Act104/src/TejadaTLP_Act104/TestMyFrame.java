/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB ACTIVITY 104 - BASIC JAVA PROGRAMMING

@author Theo Leonard Tejada
*/
package TejadaTLP_Act104;

import java.awt.*;
import javax.swing.*;

class BatonFrame extends Frame {
    BatonFrame(String s) {
        super(s);
        setSize(300,200);
        setLayout(new GridLayout(4,3));
        for(int i = 0; i < 12; i++)
            add(new Button("Button " + i));
        setVisible(true);
    }
}

public class TestMyFrame extends javax.swing.JFrame {
    TestMyFrame() {
        new BatonFrame("Example 5");
    }
}
