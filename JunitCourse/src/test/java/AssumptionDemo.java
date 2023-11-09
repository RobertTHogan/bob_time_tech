import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {

    @Test
    public void assumptionDemo(){
        Assumptions.assumeTrue("test".startsWith("t"));
        System.out.println("assume True PASSED test starts with letter t");
        Assumptions.assumeFalse("false".startsWith("q"));
        System.out.println("assume False PASSED false does not start with letter q");
    }
    @Test
    public void assumptIfElseDemo(){
        if ("test".startsWith("q"))
            System.out.println("PASSED");
        else System.out.println("FAILED");
    }
}
