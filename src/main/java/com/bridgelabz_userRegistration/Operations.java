package com.bridgelabz_userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {

    //Taking user input
    static Scanner sc = new Scanner(System.in);
    /**
     * This method takes First Name which starts with Capital letter and throws custom exception if not valid
     * @param fName is used for comparing with regex
     */
    public static boolean validFirstName(String fName) throws InvalidFirstNameException{
       /** System.out.println("Enter Your first name");
        String name = sc.next();*/
        //regix function is used to check the first name
        String regix = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regix);
        Matcher m = p.matcher(fName);
        boolean result = m.matches();
        // if condition is to check the first name is valid or not

        if (!m.matches()){
            throw new InvalidFirstNameException("first Name should start with a Cap and should have minimum 3 chars");
        }
        else
        return true;
    }
    /**
     * This method takes Last Name which starts with Capital letter and throws custom exception if not valid
     * @param lName is used for comparing with regex
     */
    public static boolean validLastName(String lName) throws InvalidLastNameException {
      /**
       System.out.println("Enter the Last name");
        String nameLast = sc.next();*/
        //regix function is used to check the first name
        String regix = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regix);
        Matcher m = p.matcher(lName);
        boolean result = m.matches();

        // if condition is to check the Last name is valid or not
        if (!m.matches()){
            throw new InvalidLastNameException("Last Name should start with a Cap and should have minimum 3 chars");
        }else
        return true;
    }
    // taking ValidEmailId method
    public static boolean validEmailId(String mailId) throws InvalidEmailIdException{
      /**
        System.out.println("Enter the Email-id : ");
        String mail_id=sc.nextLine();
       */
        //Expression for EmailId
        String rejex="^[a-z]{3,}(.[-+a-z0-9]*)?@([a-z0-9]){1,}.[a-z]{2,}+(.[a-z]{2,})*";
        //Creating pattern object
        Pattern P1=Pattern.compile(rejex);
        //Creating matcher object
        Matcher M1=P1.matcher(mailId);
        boolean result=M1.matches();
        //Checking whether entered Mail-id is valid or not

        if(!M1.matches()){
            throw new InvalidEmailIdException("enter a valid email - E.g. abc.xyz@bl.co.in ");
        }else
            return true;
    }
    /**
     * This method checks if the entered number is valid or not and throws custom exception if not valid
     * @param mobNo takes in the parameter as String representation of number
     * @return it returns a boolean value true if the number is valid
     */
    public static boolean validMobileNumber(String mobNo) throws InvalidMobileNumberException{
       /**
        System.out.println("Enter the Mobile number");
        String  mobileNumber = sc.next();
        */
        //regix function is used to check the Mobile number
        String regix = "^[0-9]{2}\\s[0-9]{11,}$";
        Pattern p1 = Pattern.compile(regix);
        Matcher m1 = p1.matcher(mobNo);
        boolean result = m1.matches();

        // if condition is to check the LMobile number is valid or not
        if (m1.matches()){
            throw new InvalidMobileNumberException("Enter the Valid Mobile number with county code eg:- 91 8764314432");
        }else
            return true;
    }
    /**
     * Method to check if the password is valid or not and throws custom exception if not valid
     * @param passwrd takes in the passcode string as a parameter
     * @return returns boolean true if the password matches the requirement
     */
    public static boolean validPassword(String passwrd) throws InvalidPasswordException{
        /**
        System.out.println("Enter the Password atleast 1 Special Symbol4 :- ");
        String password = sc.next();
        */
        /**
         * (?=.*[A-Z]) represents an upper case character that must occur at least once.
         * (?=.*[0-9]) represents a digit must occur at least once.
         * (?+.*[@#$%^&*()-+=] represent the special symbol at least once.
         * (?=.*[a-zA-z0-9]) represents a lower case character or number  must occur at least once.
         * {8,} represents at least 8 or more characters.
         */
        String regix = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern p1 = Pattern.compile(regix);
        Matcher m1 = p1.matcher(passwrd);
        boolean result = m1.matches();

        // if condition is to check the password is valid or not
        if (m1.matches()){
            throw new InvalidPasswordException("Password should Contain min 8 chars with at least: 1 capital letter, 1 numeric and exactly 1 special character ");
        }else
            return true;



    }
}
