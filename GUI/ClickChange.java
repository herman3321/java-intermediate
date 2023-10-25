package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickChange {
    public static void main(String[] args){

        JFrame jFrame = new JFrame("GUI Change Click");
        jFrame.setLayout(new FlowLayout());
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setVisible(true);

        JLabel jLabel = new JLabel("Hello My friend");
        jFrame.add(jLabel);

        //changing the text

        JButton b1 = new JButton("Change click");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                jLabel.setText("What is your name?");
            }
        });
        jFrame.add(jLabel);
        jFrame.add(b1);
    }
}
