import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\geeth\\IdeaProjects\\SeleniumWithMaven\\src\\driver\\chromedriver1.exe");

        driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            Thread.sleep(2000);
            driver.quit();
    }
}
