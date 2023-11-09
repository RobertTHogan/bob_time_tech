import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTrueDemo {

    @Test
    //test for boolean values, if requirement, cannot use Assert Equals.
    //below ex shows pass b/c string test I Love java starts with I
    public void assertForTrueTestPassed(){
        String test = "I Love java";
        //System.out.print(test.startsWith("I"));
        Assertions.assertTrue(test.startsWith("I"));
    }

    @Test
    //test for boolean values, if requirement, cannot use Assert Equals.
    //below ex shows FAIL b/c string test I Love java does not start with L
    public void assertForTrueTestFailed(){
        String test = "I Love java";
        //System.out.print(test.startsWith("I"));
        Assertions.assertTrue(test.startsWith("L"));
    }
    @Test
    //test for boolean values, if requirement, cannot use Assert Equals.
    //below ex shows FAIL b/c string test I Love java does not start with L, so will print a message for failed error
    public void assertForTrueTestFailedWithMessage(){
        String test = "I Love java";
        //System.out.print(test.startsWith("I"));
        Assertions.assertTrue(test.startsWith("L"), "Test assertTrue FAILED, because no match");
    }
    @Test
    //test for boolean values, if requirement, cannot use Assert Equals.
    //below ex shows FAIL b/c string test I Love java does not start with I, so is True will not print message
    public void assertForTrueTestPassWithFailedMessage(){
        String test = "I Love java";
        //System.out.print(test.startsWith("I"));
        Assertions.assertTrue(test.startsWith("I"), "Test assertTrue FAILED, because no match");
    }
}
