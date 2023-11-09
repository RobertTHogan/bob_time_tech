import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedCSVSource {

    @ParameterizedTest
    @CsvSource({
            "Audi, 55",
            "Ferrari, 99",
            "HellCatt, 101"
    })
    public void csvSourceMethod(String car, int quantity) {
        System.out.println(car + " : " + quantity);
    }

    @ParameterizedTest
    //Enables to fetch csv file create test-->Java-create a NEW PACKAGE ex resource
    //the paste the file to bring up Copy file/....and can name the file input.csv needs csv extension
    //when test is run will print each value in this example three tests are run print the car+#
    @CsvFileSource(files = "src/test/java/resource/input.csv")
    public void csvFileSourceMethod(String car, int quantity){
        System.out.println(car + " : " + quantity);
    }
}
