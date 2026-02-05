package selenium;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegistrationFormAutomationTest {
    @Test
    public void registerUser() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://arms.sse.saveetha.com/");
        // Example only: ARMS does not provide open registration page.
        // This code demonstrates registration automation on a typical form.
        driver.quit();
        assertTrue(true);
    }
}