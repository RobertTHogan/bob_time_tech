import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AssertEquals {

    @Test
    public void assertAlternative() {
        JavaOperations javaOperations = new JavaOperations();
        if (javaOperations.add(4, 5) == 8)
            System.out.println("Test PASSED");
        else
            System.out.println("Test FAILED");

    }

@Tag("Feature-1")
    @Test
    public void assertDemo(){
        JavaOperations javaOperations = new JavaOperations();
        int actual = javaOperations.add(4,5);
        Assertions.assertEquals(9,actual);
    }

    //Variation of AssertEquals to customize the Output  message
    //Assertions.assertEquals(8, actual, "Assertion add(4,5) failed")
    @Test
    public void assertDemowithMessage(){
        JavaOperations javaOperations = new JavaOperations();
        int actual = javaOperations.add(4,5);
        Assertions.assertEquals(8,actual, "Assertion add(4,5) Failed");
    }
}
