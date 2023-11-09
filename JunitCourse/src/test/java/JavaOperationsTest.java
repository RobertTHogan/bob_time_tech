import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class JavaOperationsTest {
    JavaOperations javaOperations;

    @BeforeAll
    ///to perform a one off task before the test executed - OPen network/make DB call - MUST BE STATIC
    public static void openDatabase(){
        System.out.println("Open database connection");
    }
    @AfterAll
    ///to perform Task after all tests executed - Close network/DB END - MUST BE STATIC
    public static void closeDatabase() {
        System.out.println("Close database connection");
}
    @BeforeEach
    public void init(){
        javaOperations = new JavaOperations();
        ///this includes all init tasks before test is run to verify
        System.out.println("Initialization Test PASSED");
    }
    @AfterEach
    public void cleanUp() {System.out.println("CleanUp Done!!"); }
        /// after the test was run this includes cleanup to verify



    @Test
    void addTest() {
       /// open database
        System.out.println("addTest.using Java Operations");
        //// close database
    }
    @Test
    void multiplyTest(){
        /// open database
        System.out.println("Multiply Test.using Java Operations");
        /// close database


    }

}