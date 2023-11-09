import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
////note: enter number of times to run the test in () @RepeatedTest(parameter). below ex. is 5


   //Normal repeated test - value ()=parameter equals number of times test is run
public class RepeatedTests {
       @RepeatedTest(5)
       public void repeatedHelloOneParam() {
           System.out.println("Hello Param");
       }

       //Repeated test with custom display name (value=, name = "Typewhatyouwanthere")
       @RepeatedTest(value = 5, name = "Executing repetition{currentRepetition}" +
               "of {totalRepetitions}")
       public void repeatedHello() {
           System.out.println("Hello");
       }
        //Repeated test with custom display name
        @RepeatedTest(value=5, name = "{displayName} {currentRepetition} " +
                "of {totalRepetitions}")
       @DisplayName("RepeatDemo:")
       public void customDisplayName(){
           System.out.println("Howdy Duty");
        }

        @RepeatedTest(value=3, name = RepeatedTest.LONG_DISPLAY_NAME)
       @DisplayName("Bob's Test!")
       public void customDisplayNameLong(){
           System.out.println("Repeat Howdy Duty");
        }

        //RepetitionInfo
       @RepeatedTest(3)
       public void repetitionInfoDemo(RepetitionInfo repetitionInfo){
           System.out.println("Current repetition  :  " + repetitionInfo.getCurrentRepetition());
           System.out.println("Total repetition  :  " + repetitionInfo.getTotalRepetitions());
       }
}



