package SeleniumTest;

import org.junit.Assert;
import org.junit.Test;

public class Validations {
    @Test
    public void validate(){
        String actual="A";
        String expected = "B";
        System.out.println("Begin");
        try {
            Assert.assertEquals(expected, actual);
        }catch (Throwable e){
            System.out.println("Some error occurred "+e);
        }

        System.out.println("End");

        //When we simply have to fail our test cases we use Assert.fail()
        //Assert.fail("Should have logged in but did not log in");
    }
}
