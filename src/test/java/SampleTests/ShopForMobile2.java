package SampleTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.DEFAULT)    // Default method execution in any order for methods
public class ShopForMobile2 {
    @Test
    public void searchMobile(){
        System.out.println("search for the mobile");
    }
    @Test
    public void selectMobile(){
        System.out.println("select  the particular mobile");
    }
    @Test
    public void checkOut(){
        System.out.println("make payment&checkout");
    }

}

