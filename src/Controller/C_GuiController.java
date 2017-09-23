/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class C_GuiController {

    String data_;
    public void alert_error(String error) {
        JOptionPane.showMessageDialog(null, " Error " + error);
    }

    public void alert_success(String success) {
        JOptionPane.showMessageDialog(null, " Success ");
    }

    public void alert_login(String login) {
        if (login.toString().equals("success")) {
            JOptionPane.showMessageDialog(null, " Success Login");
        } else if (login.toString().equals("failed")) {
            JOptionPane.showMessageDialog(null, "Login Failed");
        } else if (login.toString().equals("no_active")) {
            JOptionPane.showMessageDialog(null, "Account No Active");
        } else if (login.toString().equals("sensitive")) {
            JOptionPane.showMessageDialog(null, "Sensitive Username & Password, please correction");
        } else {
            JOptionPane.showMessageDialog(null, "BUG System");
        }
    }

    public boolean validate_login(String username) {
        boolean valid = false;
        if (username.toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usernamae Not Null");
        } else {
            valid = true;
        }
        return valid;
    }
    
    

}
