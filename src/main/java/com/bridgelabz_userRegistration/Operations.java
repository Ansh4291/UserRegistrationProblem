package com.bridgelabz_userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    // taking ValidFirstName method
    static Scanner sc = new Scanner(System.in);
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
}
