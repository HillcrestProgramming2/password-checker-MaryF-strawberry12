package org.hillcrest.chapter6.password;

public class CriteriaChecker {

    public static int evaluateCriteria(String password) {
        int countMet = 0;
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "1234567890";
        String specials = "!@#$%^&*()-+=";

        if (password.length() < 8) {
            countMet++;
        }
        for (int i = 0; i < upperAlphabet.length(); i++) {
            if (password.contains(String.valueOf(upperAlphabet.charAt(i)))) {
                countMet++;
                break;
            }
        }
        for (int i = 0; i < lowerAlphabet.length(); i++) {
            if (password.contains(String.valueOf(lowerAlphabet.charAt(i)))) {
                countMet++;
                break;
            }
        }
        for (int i = 0; i < digits.length(); i++) {
            if (password.contains(String.valueOf(digits.charAt(i)))) {
                countMet++;
                break;
            }
        }
        for (int i = 0; i < specials.length(); i++) {
            if (password.contains(String.valueOf(specials.charAt(i)))) {
                countMet++;
                break;
            }
        }
        return countMet;
    }

    public static String determineStrength(int score) {
        String strength = "";
        if (score <= 2) {
            strength = "Weak";
        }
        else if (score == 3) {
            strength = "Moderate";
        }
        else if (score >= 4) {
            strength = "Strong";
        }

        return strength;
    }
}
