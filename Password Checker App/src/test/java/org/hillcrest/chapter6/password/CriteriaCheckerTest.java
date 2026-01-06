package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CriteriaCheckerTest {
    @Test
    public void testFunctions_WeakestPasswordShouldBeCorrect() {
        Assertions.assertEquals(0, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria(""));
        Assertions.assertEquals("Weak", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(0));
    }
    @Test
    public void testFunctions_WeakerPasswordShouldBeCorrect() {
        Assertions.assertEquals(1, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria("s"));
        Assertions.assertEquals("Weak", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(1));
    }
    @Test
    public void testFunctions_WeakPasswordShouldBeCorrect() {
        Assertions.assertEquals(2, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria("s1"));
        Assertions.assertEquals("Weak", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(2));
    }
    @Test
    public void testFunctions_ModeratePasswordShouldBeCorrect() {
        Assertions.assertEquals(3, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria("@s1"));
        Assertions.assertEquals("Moderate", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(3));
    }
    @Test
    public void testFunctions_StrongPasswordShouldBeCorrect() {
        Assertions.assertEquals(4, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria("@s1S"));
        Assertions.assertEquals("Strong", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(4));
    }
    @Test
    public void testFunctions_StrongestPasswordShouldBeCorrect() {
        Assertions.assertEquals(5, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria("Password@99999"));
        Assertions.assertEquals("Strong", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(5));
    }
}