import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsWithArrays {

    @Test
    //Example Array FAILS because object 1 does not match object 2 see a 2, 2, 3 and b 1,2,3
    public void assertsWithArraysFailDemo(){
        int a[] = new int[]{2,2,3}; // created object 1
        int b[] = new int[]{1,2,3}; // created object 2 - two different objects requires separate method
        //Assertions.assertEquals(a,b);
        //Assertions.assertArrayEquals(a,b);
        Assertions.assertArrayEquals(a, b, "Comparison of arrays FAILED");
    }
    @Test
    //Example Array PASS because object 1 and object 2 matches
    public void assertsWithArraysPASSDemo(){
        int a[] = new int[]{1,2,3}; // created object 1
        int b[] = new int[]{1,2,3}; // created object 2 - two different objects requires separate method
        //Assertions.assertEquals(a,b);
        //Assertions.assertArrayEquals(a,b);
        Assertions.assertArrayEquals(a, b, "Comparison of arrays Failed message, message only comes up if fails");

    }
}

