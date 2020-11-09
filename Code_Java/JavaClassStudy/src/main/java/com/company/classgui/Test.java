/*
 * Created by JFormDesigner on Sat Nov 07 19:25:55 CST 2020
 */

package com.company.classgui;

import java.awt.*;
import java.awt.event.*;
import java.util.ResourceBundle;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Test<dialogPane> extends JFrame {
    public Test() {
        initComponents();
    }

    private void confirm(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("com.company.classgui.Test");
        textalert = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3,align center center",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- textalert ----
        textalert.setText(bundle.getString("textalert.text"));
        textalert.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                confirm(e);
            }
        });
        contentPane.add(textalert, "cell 1 1 7 3");

        //---- button1 ----
        button1.setText(bundle.getString("button1.text"));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                confirm(e);
            }
        });
        contentPane.add(button1, "cell 0 7");

        //---- button2 ----
        button2.setText(bundle.getString("button2.text"));
        contentPane.add(button2, "cell 8 7");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextField textalert;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    ResourceBundle bundle = ResourceBundle.getBundle("Test");
}
