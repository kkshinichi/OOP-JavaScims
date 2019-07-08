/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB ACTIVITY 104 - BASIC JAVA PROGRAMMING

@author Theo Leonard Tejada
*/
package TejadaTLP_Act104;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonFrame implements ActionListener {
    Frame woot;

    Button MyAverage1, MyAverage2, MyIfElse, MyInput;
    Button MyLoop, MyPword, TestMyFrame, Exit;

    Label label;

    ButtonFrame() {
        woot = new Frame("Basic Java Programming");
        // Button Declaration
        MyAverage1 = new Button("MyAverage1");
        MyAverage2 = new Button("MyAverage2");
        MyIfElse = new Button("MyIfElse");
        MyInput = new Button("MyInput");
        MyLoop = new Button("MyLoop");
        MyPword = new Button("MyPword");
        TestMyFrame = new Button("TestMyFrame");
        Exit = new Button("Exit");

        label = new Label();
        
        woot.add(MyAverage1);
        woot.add(MyAverage2);
        woot.add(MyIfElse);
        woot.add(MyInput);
        woot.add(MyLoop);
        woot.add(MyPword);
        woot.add(TestMyFrame);
        woot.add(Exit);

        MyAverage1.addActionListener(this);
        MyAverage2.addActionListener(this);
        MyIfElse.addActionListener(this);
        MyIfElse.addActionListener(this);
        MyInput.addActionListener(this);
        MyLoop.addActionListener(this);
        MyPword.addActionListener(this);
        TestMyFrame.addActionListener(this);
        Exit.addActionListener(this);

        woot.setLayout(new GridLayout(2,4));
        woot.setSize(600,150);
        woot.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("MyAverage1")) {
            new MyAverage1().setVisible(true);
        }
        else if(ae.getActionCommand().equals("MyAverage2")) {
            new MyAverage2().setVisible(true);
        }
        else if(ae.getActionCommand().equals("MyIfElse")) {
            new MyIfElse().setVisible(true);
        }
        else if(ae.getActionCommand().equals("MyInput")) {
            new MyInput().setVisible(true);
        }
        else if(ae.getActionCommand().equals("MyLoop")) {
            new MyLoop().setVisible(true);
        }
        else if(ae.getActionCommand().equals("MyPword")) {
            new MyPword().setVisible(true);
        }
        else if(ae.getActionCommand().equals("MyStringComp")) {
            new MyStringComp().setVisible(true);
        }
        else if(ae.getActionCommand().equals("TestMyFrame")) {
            new TestMyFrame().setVisible(true);
        }
        else if(ae.getActionCommand().equals("Exit"))
            System.exit(0);
    }
}
