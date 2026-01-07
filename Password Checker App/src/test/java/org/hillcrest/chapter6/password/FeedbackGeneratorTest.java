package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the FeedbackGenerator class
 */
public class FeedbackGeneratorTest {
    @Test
    public void test_WeakestPasswordFeedback() {
        String feedback = org.hillcrest.chapter6.password.FeedbackGenerator.generateFeedback("");
        Assertions.assertTrue(feedback.contains("Increase the length"));
        Assertions.assertTrue(feedback.contains("uppercase"));
        Assertions.assertTrue(feedback.contains("lowercase"));
        Assertions.assertTrue(feedback.contains("special character"));
        Assertions.assertTrue(feedback.contains("one number"));
    }
    @Test
    public void test_WeakerPasswordFeedback() {
        String feedback = org.hillcrest.chapter6.password.FeedbackGenerator.generateFeedback("s");
        Assertions.assertTrue(feedback.contains("Increase the length"));
        Assertions.assertTrue(feedback.contains("uppercase"));
        Assertions.assertTrue(feedback.contains("special character"));
        Assertions.assertTrue(feedback.contains("one number"));
    }
    @Test
    public void test_WeakPasswordFeedback() {
        String feedback = org.hillcrest.chapter6.password.FeedbackGenerator.generateFeedback("d2");
        Assertions.assertTrue(feedback.contains("Increase the length"));
        Assertions.assertTrue(feedback.contains("uppercase"));
        Assertions.assertTrue(feedback.contains("special character"));
    }
    @Test
    public void test_ModeratePasswordFeedback() {
        String feedback = org.hillcrest.chapter6.password.FeedbackGenerator.generateFeedback("Ss3");
        Assertions.assertTrue(feedback.contains("Increase the length"));
        Assertions.assertTrue(feedback.contains("special character"));
    }
    @Test
    public void test_StrongPasswordFeedback() {
        String feedback = org.hillcrest.chapter6.password.FeedbackGenerator.generateFeedback("Ss2@");
        Assertions.assertTrue(feedback.contains("Increase the length"));
    }
    @Test
    public void test_StrongestPasswordFeedback() {
        String feedback = org.hillcrest.chapter6.password.FeedbackGenerator.generateFeedback("Ss2@382394234728347234");
        Assertions.assertEquals("", feedback);
    }
}


