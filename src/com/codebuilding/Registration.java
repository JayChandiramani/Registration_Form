package com.codebuilding;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration {

    private JPanel RegisForm;
    private JTextField Fname;
    private JTextField Lname;
    private JPasswordField password;
    private JPasswordField confirmpassword;
    private JButton registerButton;
    private JTextField emailtext;
    private JComboBox Gender;
    private JTextField Day;
    private JTextField Month;
    private JTextField Year;
    private JTextField Username;
    private JButton cancelButton;

    public Registration() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Fname.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Invalid First Name.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                else {
                    if (Lname.getText().equals(""))
                        JOptionPane.showMessageDialog(null, "Invalid Last Name.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                    else {
                        if (Username.getText().equals(""))
                            JOptionPane.showMessageDialog(null, "Invalid username.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                        else {
                            if (Gender.getSelectedItem().toString().equals(""))
                                JOptionPane.showMessageDialog(null, "Please select your gender.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                            else {
                                if (Day.getText().equals(""))
                                    JOptionPane.showMessageDialog(null, "Invalid Date of Birth.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                                else {
                                    if (Month.getText().equals(""))
                                        JOptionPane.showMessageDialog(null, "Invalid Date of Birth.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                                    else {
                                        if (Year.getText().equals(""))
                                            JOptionPane.showMessageDialog(null, "Invalid Date of Birth.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                                        else {
                                            if (emailtext.getText().equals(""))
                                                JOptionPane.showMessageDialog(null, "Invalid Email Address.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                                            else {
                                                if (password.getText().equals(""))
                                                    JOptionPane.showMessageDialog(null, "Invalid Password.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                                                else {
                                                    if (confirmpassword.getText().equals(""))
                                                        JOptionPane.showMessageDialog(null, "Please re-enter the same password.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                                                    else {
                                                        if (password.getText().equals(confirmpassword.getText()))
                                                            JOptionPane.showMessageDialog(null, "Welcome To The Application", "Registration Complete", JOptionPane.INFORMATION_MESSAGE);
                                                        else {
                                                            JOptionPane.showMessageDialog(null, "The passwords which you have entered do not match.", "Invalid Password", JOptionPane.WARNING_MESSAGE);
                                                            password.setText("");
                                                            confirmpassword.setText("");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });

        Fname.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Fname.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Invalid First Name.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            }
        });
        Lname.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Lname.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Invalid Last Name.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            }
        });
        Username.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Username.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Invalid username.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            }
        });
        Gender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Gender.getSelectedItem().toString().equals(""))
                    JOptionPane.showMessageDialog(null, "Please select your gender.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            }
        });
        Day.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Day.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Invalid Date of Birth.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            }
        });
        Month.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Month.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Invalid Date of Birth.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            }
        });
        Year.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Year.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Invalid Date of Birth.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            }
        });
        emailtext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (emailtext.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Invalid Email Address.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            }
        });
        password.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (password.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Invalid Password.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            }
        });
        confirmpassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (confirmpassword.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Please re-enter the same password.", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                else {
                    if (password.getText().equals(confirmpassword.getText()));
                    else {
                        JOptionPane.showMessageDialog(null, "The passwords which you have entered do not match.", "Invalid Password", JOptionPane.WARNING_MESSAGE);
                        password.setText("");
                        confirmpassword.setText("");
                    }
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Registration Cancelled.", "Cancellation", JOptionPane.INFORMATION_MESSAGE);
                Fname.setText("");
                Lname.setText("");
                Username.setText("");
                Gender.setSelectedItem("");
                Day.setText("");
                Month.setText("");
                Year.setText("");
                emailtext.setText("");
                password.setText("");
                confirmpassword.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame RegFrame;
        RegFrame = new JFrame("Registration Form");
        RegFrame.setContentPane(new Registration().RegisForm);
        RegFrame.pack();
        RegFrame.setVisible(true);
    }
}