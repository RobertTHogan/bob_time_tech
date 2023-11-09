import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class ParameterizedTestsDemo {

    @ParameterizedTest
    @ValueSource(strings = {"abc", "xyz", ""})
    //(strings = {}) can enter any values, additional values are separated by comma, the "" value
    //is a blank value.In this test there are three tests based on the values in string valueSource.
    //The first two abc and xyz will FAil and the last one will Pass because the value is blank
    public void checkBlanks(String value){
        Assertions.assertTrue(StringUtils.isBlank(value));
    }
    @ParameterizedTest(name = "Check blanks {displayName}")
    //display Name example that will print in output of report test file
    @ValueSource(strings = {"abc", "xyz", ""})
    public void checkBlanksWithPlaceholderDisplayName(String value){
        Assertions.assertTrue(StringUtils.isBlank(value));
    }
    @ParameterizedTest(name = "Check blanks {index}")
    //display Name example that will print in output of report test file
    @ValueSource(strings = {"abc", "xyz", ""})
    public void checkBlanksWithPlaceholderIndex(String value){
        Assertions.assertTrue(StringUtils.isBlank(value));
    }
    @ParameterizedTest(name = "Check blanks {0}")
    //display Name example that will print in output of report test file
    @ValueSource(strings = {"abc", "xyz", ""})
    public void checkBlanksWithPlaceholderValue0(String value) {
        Assertions.assertTrue(StringUtils.isBlank(value));
    }
    @ParameterizedTest(name = "Check blanks {arguments}")
    //arguments example will list all the arguments to show the list of arguments against the test cases in the test report
    @ValueSource(strings = {"abc", "xyz", ""})
    public void checkBlanksWithPlaceholderArguments(String value){
        Assertions.assertTrue(StringUtils.isBlank(value));
    }
    @ParameterizedTest(name = "Check blanks {0}")
//When using @EmptySource annotation the one above has ""=blank, but {}=0+@EmptySource=0
    @ValueSource(strings = {"abc", "xyz",})
    @EmptySource
    public void checkBlanksWithPlaceholderEmptySource(String value){
        Assertions.assertTrue(StringUtils.isBlank(value));
    }
    @ParameterizedTest(name = "Check blanks {0}")
//@NullAndEmptySource annotation that will p rint out in the report test results as "null"
    @ValueSource(strings = {"abc", "xyz"})
    @NullSource
    public void checkBlanksWithPlaceholderNullEmptySource(String value){
        Assertions.assertTrue(StringUtils.isBlank(value));
    }
}
