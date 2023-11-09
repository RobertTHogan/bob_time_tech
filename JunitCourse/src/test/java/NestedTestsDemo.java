import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

public class NestedTestsDemo {
    /*
    Nested Test Rules
    1.All nested class have to be non-static inner class.
    2.Nested classes have to be annotated with the help of @Nested annotation.
    3.There is no depth to the hierarchy of nested classes.
    4. @BeforeAll and @AfterAll methods DO NOT work by default in nested classes since
        those methods have to be static by default and static keyword is NOT allowed
        inside inner classes in JAVA.

                How to add @BeforeAll and @AfterAll in nested classes:
                   Can declare nested classes using @TestInstance(Lifecycle.Per_CLASS) and make that class as static.
    5. Nested classes can have @BeforeEach and @AfterEach methods.
     */

    @Test
    public void printHello() {
        System.out.println("Hello Outer");

        @Nested
        @TestInstance(TestInstance.Lifecycle.PER_CLASS)
        class NestedDemo {
            @BeforeAll
            public void beforeAllDemo() {
                System.out.println("Before all inner");
            }


        @Test
        public void printHelloInner(){
            System.out.println("Hello Inner");
        }
    }
}}
