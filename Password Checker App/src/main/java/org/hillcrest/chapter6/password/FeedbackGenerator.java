package org.hillcrest.chapter6.password;

public class FeedbackGenerator {

    public static String generateFeedback(String password) {
        boolean lengthCheck = false;
        boolean upperCheck = false;
        boolean lowerCheck = false;
        boolean numberCheck = false;
        boolean specialCheck = false;
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "1234567890";
        String specials = "!@#$%^&*()-+=";
        String feedback = "";
        if (password.length() >= 8) {
            lengthCheck = true;
        }
        for (int i = 0; i < upperAlphabet.length(); i++) {
            if (password.contains(String.valueOf(upperAlphabet.charAt(i)))) {
                upperCheck = true;
                break;
            }
        }
        for (int i = 0; i < lowerAlphabet.length(); i++) {
            if (password.contains(String.valueOf(lowerAlphabet.charAt(i)))) {
                lowerCheck = true;
                break;
            }
        }
        for (int i = 0; i < digits.length(); i++) {
            if (password.contains(String.valueOf(digits.charAt(i)))) {
                numberCheck = true;
                break;
            }
        }
        for (int i = 0; i < specials.length(); i++) {
            if (password.contains(String.valueOf(specials.charAt(i)))) {
                specialCheck = true;
                break;
            }
        }

        if (!lengthCheck) {
            feedback = feedback + "Increase the length to at least 8 characters\n";
        }
        if (!upperCheck) {
            feedback = feedback + "Add at least one uppercase letter.\n";
        }
        if (!lowerCheck) {
            feedback = feedback + "Add at least one lowercase letter.\n";
        }
        if (!numberCheck) {
            feedback = feedback + "Add at least one number.\n";
        }
        if (!specialCheck) {
            feedback = feedback + "Include at least one special character.\n";
        }
        return feedback;
    }



}
