package SeleniumTest;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//Step 1: Add the @RunWith(Parameterized.class) annotation
@RunWith(Parameterized.class)
public class LoginTestWithParameters {
    String username;
    String password;
    String browser;

    public LoginTestWithParameters(String username, String password, String browser){
        this.username=username;
        this.password=password;
        this.browser=browser;
    }
    @Test
    public void loginTest(){
        System.out.println(username+ "----"+ password+"----"+ browser);
    }

    //Give parameters

    @Parameterized.Parameters
    public static Collection<Object[]> getData(){
        Object [][] data =new Object[4][3];
        //Row 1
        data[0][0] = "rudra";
        data[0][1] = "1234";
        data[0][2] = "chrome";
        //Row 2
        data[1][0] = "geetha";
        data[1][1] = "devi";
        data[1][2] = "brave";
        //Row 3
        data[2][0] = "shree";
        data[2][1] = "nagesh";
        data[2][2] = "firefox";
        //Row 4
        data[3][0] = "swathi";
        data[3][1] = "gowda";
        data[3][2] = "IE";

        return Arrays.asList(data);

    }
}
