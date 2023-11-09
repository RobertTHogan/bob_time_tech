import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertFalseDemo {

    @Test
    //This test will FAIL because I is true string starts with I
    public void assertForFalse(){
        String test = "I Love java";
        Assertions.assertFalse(test.startsWith("I"));
    }
    @Test
    //This test will PASS because I is false string starts with I, not J. If it did fail add message to print
    public void assertForFalsePass(){
        String test = "I Love java";
        Assertions.assertFalse(test.startsWith("J"), "Test assertFalse FAILED");
    }
}
