import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class ParameterizedTestEnumSource {
//@EnumSource annotation allows run test Enum values as a source. If Enum values defined, can use
//    those values for your test case.
//MUST HAVE AN ENUM VALUE DEFINED
    @ParameterizedTest(name = "Check blanks {0}")
    @EnumSource(Value.class)
    public void checkBlankswithPlaceholderEnum(Object value){
        /////commented out code--Assertions.assertTrue(StringUtils.isBlank(value));
        System.out.println(value.toString());
    }
    @ParameterizedTest(name = "Check blanks {0}")
    @EnumSource(value = Value.class, names = {"ABC"},mode = EnumSource.Mode.EXCLUDE)
    public void checkBlankswithPlaceholderEnumModeAttribute(Object value){
        /////In this example @EnumSource(value = Value.class, names = {"ABC"},mode = EnumSource.Mode.EXCLUDE)
        ///will not run a test on ABC
        System.out.println(value.toString());
    }

    enum Value{
        ABC, XYZ, WXY, PQX
    }
    @ParameterizedTest(name = "Check blanks {0}")
    @EnumSource(value = Value.class, names = {"A.."},mode = EnumSource.Mode.MATCH_ALL)
    public void checkBlankswithPlaceholderEnumModeAttriMatchAll(Object value2){
        /////In this example @EnumSource(value = Value.class, names = {"ABC"},mode = EnumSource.Mode.EXCLUDE)
        ///will not run a test on ABC
        System.out.println(value2.toString());
    }

    enum Value2{
        ABC, XYZ, WXY, PQX
    }
}
