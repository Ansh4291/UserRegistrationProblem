package com.bridgelabz_userRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.bridgelabz_userRegistration.Operations.*;

public class OperationsTest {
    //Creating object for opertaion class in main method
    Operations operations = new Operations();
//         True test case for first name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.userValidate1.validate1("Anshul"));
            System.out.println("First Name is valid");
        }catch (InvalidFirstNameException e){
            System.out.println("A problem occurred :-( " + e);
        }

    }
    //         False test case for First name
//    @Test
//    public void givenFirstName_WhenProper_ShouldReturnFalse() {
//        boolean result = validFirstName("anshul");
//        System.out.println(result);
//        Assertions.assertFalse(result);
//    }
    //         True test case for Last name

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.userValidate2.validate2("Rathore"));
            System.out.println("Last Name is valid");
        }catch (InvalidLastNameException e){
            System.out.println("A Problem Occurred :-( " + e);
        }

    }
    //         False test case for Last name
//    @Test
//    public void givenLastName_WhenProper_ShouldReturnFalse() {
//        boolean result = validLastName("rathore");
//        System.out.println(result);
//        Assertions.assertFalse(result);
//    }
    //         True test case for Email Id
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.userValidate3.validate3("anshulrathore1995@gmail.com"));
            System.out.println("Email Id is valid ");
        }catch (InvalidEmailIdException e){
            System.out.println("A problem occurred " + e);
        }

    }
    //         False test case for Email Id
//    @Test
//    public void givenEmailId_WhenProper_ShouldReturnFalse() {
//        boolean result = validEmailId("@anshulrathore1995@gmailcom");
//        System.out.println(result);
//        Assertions.assertFalse(result);
//    }
    //         True test case for Mobile number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.userValidate4.validate4("91 874314432"));
            System.out.println("Mobile number is valid ");
        }catch (InvalidMobileNumberException e){
            System.out.println("A problem Occurred" + e);
        }

    }
    //         False test case for Mobile Number
//    @Test
//    public void givenMobileNumber_WhenProper_ShouldReturnFalse() {
//        boolean result = validMobileNumber("91 876431443");
//        System.out.println(result);
//        Assertions.assertFalse(result);
//    }
    //         True test case for Password
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()  {
        try {
            Assertions.assertTrue(operations.userValidate5.validate5("RRathoreqww"));
            System.out.println("Password is valid");
        }catch (InvalidPasswordException e){
            System.out.println("A problem is occurred " + e);
        }

    }
    //         False test case for Password
//    @Test
//    public void givenPassword_WhenProper_ShouldReturnFalse() {
//        boolean result = validPassword("R1dfghj");
//        System.out.println(result);
//        Assertions.assertFalse(result);
//    }

}