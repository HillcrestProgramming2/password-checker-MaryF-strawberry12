package org.hillcrest.chapter6.password;

import java.util.Scanner;

public class PasswordCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Password Strength Checker!\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = in.nextLine();
        int strengthNum = org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria(password);
        String strength = org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(strengthNum);
        String feedback = org.hillcrest.chapter6.password.FeedbackGenerator.generateFeedback(password);
        System.out.printf("Your password is %s with a numerical strength of %d out of 5", strength, strengthNum);
        if (strengthNum < 5) {
            System.out.println("\nHere is some feedback to make your password stronger: ");
            System.out.println(feedback);
        }
        else {
            System.out.println("\nPrint you have no feedback! Good job!");
        }
    }
}
