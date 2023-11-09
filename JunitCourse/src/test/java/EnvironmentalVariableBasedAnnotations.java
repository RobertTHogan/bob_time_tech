import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnvironmentalVariableBasedAnnotations {
    /*@EnabledIfEnvironmentVariable
    @DisabledIfEnvironmentVariable
    */
    @Test
    @EnabledIfEnvironmentVariable(named = "user.home", matches = "C:\\Users\\robert.hogan")
    public void matchesUserHome() {
        System.out.println("User name matches");

    }
    @Test
    @DisabledIfEnvironmentVariable(named = "user.home", matches = "C:\\Users\\robert.hogan")
    public void matchesUserHomeDisabled() {
        System.out.println("User name matches");

    }
}
