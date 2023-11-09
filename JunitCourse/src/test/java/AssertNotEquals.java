import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AssertNotEquals {
    //first create method starting with public void then method(){


    /*@Test
    //public void assertNotEqualsDemo(){
        JavaOperations javaOperations = new JavaOperations();
        Assertions.assertNotEquals(10, javaOperations.add(4,5));
*/

    //The shows how to add a message to display in the test output for fails
    @Test
    public void assertNotEqualswithMessageDemo(){
        JavaOperations javaOperations = new JavaOperations();
        Assertions.assertNotEquals(9, javaOperations.add(4,5),
                "Assertion add(4,5) FAILED");
    }
}
