import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class OperatingSystemAnnotations {
    @Test
    ///@EnabledOnOs(OS.WINDOWS)
   ////@EnabledOnJre(JRE.JAVA_8)
    ///can test on select Operating Systems Windows, MAC, etc.
    public void printHello() {
        System.out.println("Hello");
        {

        }
    }
    @Test
    ///@DisabledOnOs(OS.WINDOWS)
    public void printHelloPythod(){
        System.out.println("Hellow Python");
    }
}
