/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelgui;

import javax.swing.JOptionPane;

public class validation {
    public static boolean validateName(String name) {
        if(name.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in Customer Name!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!name.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "Name should contain only letters and spaces", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean validatePhone(String phone) {
        if(phone.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in Customer Phone Number!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(phone.trim().length() < 7 || phone.trim().length() > 15){
            JOptionPane.showMessageDialog(null, "Invalid Phone Number! (min 7 max 15)", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean validateEmail(String email) {
        if(email.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in Customer Email Address!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String emailPattern = "^(.+)@(\\S+)$";
        if(!email.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Email", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean validateIdentity(String identity) {
        if(identity.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in the Customer IC/Passport!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean validateCountry(String country) {
        if(country.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in Customer Country!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!country.matches("^[a-zA-Z]+$")) {
            JOptionPane.showMessageDialog(null, "Only letters are allowed for Country", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
