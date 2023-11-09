import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupedAssertions {

    @Test
    public void groupedAssertionDemo(){
        JavaOperations javaOperations = new JavaOperations();
        Assertions.assertEquals(4, javaOperations.add(3,1));
        Assertions.assertEquals(25, javaOperations.add(3,22));
        Assertions.assertEquals(100, javaOperations.add(70,30));
    }
    @Test
    //Example of error of assertion equals stops test the last two are NOT tests-So see Lamda below
    public void groupedAssertionExpectValueWrongDemo(){
        JavaOperations javaOperations = new JavaOperations();
        Assertions.assertEquals(5, javaOperations.add(3,1));
        Assertions.assertEquals(26, javaOperations.add(3,22));
        Assertions.assertEquals(101, javaOperations.add(70,30));
    }

    @Test
    //Example of assertAll using Lambda to run all test/assertions whether PASS or FAIL
    public void groupedAssertionMultAssertWithLambda(){
        JavaOperations javaOperations = new JavaOperations();
        Assertions.assertAll(()->
                Assertions.assertEquals(4, javaOperations.add(3,1)),
                ()->Assertions.assertEquals(25, javaOperations.add(3,22)),
                ()->Assertions.assertEquals(100, javaOperations.add(70,30))
        );

    }
}
