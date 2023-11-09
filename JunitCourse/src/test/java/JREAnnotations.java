import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class JREAnnotations {
    /*
    @EnabledOnJre
    @DisabledOnJre
    @EnabledOnJre
    @DisabledOnJre
     */
    @Test
    @EnabledOnJre(JRE.JAVA_11)

    public void printHelloJre() {
        System.out.println("Hello Jre");
    }

    @Test
    @DisabledOnJre({JRE.JAVA_11, JRE.JAVA_8})

    public void printHelloJreDisabled() {
        System.out.println("Hello Jre");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_10, max = JRE.JAVA_11)
    public void printJava8to11() {
        System.out.println("Hi");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_10)
    public void printJavaMin10() {
        System.out.println("Hello");
    }

    @Test
    @DisabledForJreRange(max = JRE.JAVA_10)
    public void printJavaDisabled9to10() {
        System.out.println("Howdy Duty");
    }
}

