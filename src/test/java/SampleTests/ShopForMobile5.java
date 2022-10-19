package SampleTests;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class ShopForMobile5 {
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
    @Test
    public void testA(){
        System.out.println("Test A");
    }
    @Test
    public void testB(){
        System.out.println("Test B");
    }
    @Ignore
    @Test
    public void testC(){
        System.out.println("Test C");
    }
}
