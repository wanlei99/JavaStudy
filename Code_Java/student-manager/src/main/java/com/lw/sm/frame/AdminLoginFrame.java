package com.lw.sm.frame;

import com.lw.sm.factory.ServiceFactory;
import com.lw.sm.utils.ResultEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName AdminLoginFrame
 * @Description TODO
 * @Author WL
 * @Date 2020/11/15
 **/
public class AdminLoginFrame extends JFrame {
    private JPanel mainPanel;
    private JButton loginButton;
    private JLabel titleLabel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel messagePanel;
    private JTextField accountTextField;
    private JPasswordField passwordField;
    private JButton resetButton;

    public AdminLoginFrame() {
        this.setTitle("AdminLoginFrame");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        loginButton.addActionListener(e -> {
            //获取输入的账号和密码，注意密码门框组件的使用方法
            String account = accountTextField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();
            ResultEntity resultEntity = ServiceFactory.getAdminServiceInstance().adminLogin(account,password);
            JOptionPane.showMessageDialog(mainPanel,resultEntity.getMessage());
            if (resultEntity.getCode() == 0) {
                //关闭登陆
                this.dispose();
                new MainFrame();
            } else {
                accountTextField.setText("");
                passwordField.setText("");
            }
        });

        resetButton.addActionListener(e -> {
            accountTextField.setText("");
            passwordField.setText("");
        });
    }
    public static void main(String[] args) {
        new AdminLoginFrame();
    }
}
