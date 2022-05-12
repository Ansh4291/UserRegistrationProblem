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
        boolean result = validFirstName("Anshul");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    //         False test case for First name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        boolean result = validFirstName("anshul");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    //         True test case for Last name

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = validLastName("Rathore");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    //         False test case for Last name
    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        boolean result = validLastName("rathore");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    //         True test case for Email Id
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = validEmailId("anshulrathore1995@gmail.com");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    //         False test case for Email Id
    @Test
    public void givenEmailId_WhenProper_ShouldReturnFalse() {
        boolean result = validEmailId("@anshulrathore1995@gmailcom");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    //         True test case for Mobile number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result = validMobileNumber("91 8005759206");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    //         False test case for Mobile Number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnFalse() {
        boolean result = validMobileNumber("91 876431443");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    //         True test case for Password
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = validPassword("R1@athoreqwer");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    //         False test case for Password
    @Test
    public void givenPassword_WhenProper_ShouldReturnFalse() {
        boolean result = validPassword("R1dfghj");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

}