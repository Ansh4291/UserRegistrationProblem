package com.bridgelabz_userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    //Taking user input
    static Scanner sc = new Scanner(System.in);
    // taking ValidFirstName method
    public static boolean validFirstName() {
        System.out.println("Enter Your first name");
        String name = sc.next();
        //regix function is used to check the first name
        String regix = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regix);
        Matcher m = p.matcher(name);
        boolean result = m.matches();
        // if condition is to check the first name is valid or not
        if (result)
            System.out.println("Your First name is valid");
        else
            System.out.println("Your First name is invalid");
        return result;
    }
    // taking ValidLastName method
    public static boolean validLastName() {
        System.out.println("Enter the Last name");
        String nameLast = sc.next();
        //regix function is used to check the first name
        String regix = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regix);
        Matcher m = p.matcher(nameLast);
        boolean result = m.matches();
        // if condition is to check the Last name is valid or not
        if (result)
            System.out.println("Your Last name is valid");
        else
            System.out.println("Your Last name is invalid");
        return result;
    }
    // taking ValidEmailId method
    public static boolean validEmailId(){
        System.out.println("Enter the email id ");
        String emailId = sc.next();
        String regex = "^[a-z]{3}[a-zA-z.]{0,}+@+bl.co+[a-z]{0,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        boolean result = m.matches();
        // if condition is to check the Last name is valid or not
        if (result)
            System.out.println("Your email id is valid");
        else
            System.out.println("Your Email Id is invalid");
        return result;
    }
    // taking ValidPassword method
    public static boolean validPassword(){
        System.out.println("Enter the Password atleast 1 Special Symbol4" +
                ":- ");
        String password = sc.next();
        /**
         * (?=.*[A-Z]) represents an upper case character that must occur at least once.
         * (?=.*[0-9]) represents a digit must occur at least once.
         * (?+.*[@#$%^&*()] represent the special symbol at least once.
         * (?=.*[a-zA-z0-9]) represents a lower case character or number  must occur at least once.
         * {8,} represents at least 8 or more characters.
         */
        String regix = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern p1 = Pattern.compile(regix);
        Matcher m1 = p1.matcher(password);
        boolean result = m1.matches();
        // if condition is to check the password is valid or not
        if (result)
            System.out.println("Your Password is valid");
        else
            System.out.println("Your Password is invalid should have atleast 1 special symbol");
        return result;
    }
}
