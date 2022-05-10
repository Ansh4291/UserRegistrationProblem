package com.bridgelabz_userRegistration;

import static com.bridgelabz_userRegistration.Operations.sc;

/**
 * This method takes Last Name which starts with Capital letter and has minimum of 3 characters
 */
// taking main class User Registration
public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the user registration problem:-) ");
        /** in main method
         * taking integer choose variable  using switch case to calling methods
         * taking integer want variable using do while loop to repeat the switch case
         */
        Operations operations = new Operations();
        int choose;
        int want;
        do {
            System.out.println("Press 1 to Check your first name is valid or not");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    operations.validFirstName();
                    break;
                default:
                    System.out.println("enter valid input");
                    break;
            }
            System.out.println("if you want to continue press 1");
            want = sc.nextInt();
        }while (want == 1);
    }
}