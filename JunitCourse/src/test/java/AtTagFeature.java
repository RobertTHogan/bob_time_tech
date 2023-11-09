import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AtTagFeature {
        @Test
        public void assertAlternative() {
            JavaOperations javaOperations = new JavaOperations();
            if (javaOperations.add(4, 5) == 8)
                System.out.println("Test PASSED");
            else
                System.out.println("Test FAILED");

        }


        /*Can use @Tag() enter whatever name "whatevername here".
        //But need to go to build.gradlefile.test {
        //    useJUnitPlatform {
        //        includeTags("feature-1")
        //        }
        //    }
        **/
        @Tag(value = "Feature-1")
        @Test
        public void assertDemo(){
            JavaOperations javaOperations = new JavaOperations();
            int actual = javaOperations.add(4,5);
            Assertions.assertEquals(10,actual);
            System.out.println("AssertEquals Test FAILED 5+4=9 not expected value 10");
        }

    }

