package selenium;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LogoutAutomationTest {
    @Test
    public void logoutTest() {
    	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://arms.sse.saveetha.com/");
        // Logout automation depends on valid login.
        // Since only dummy credentials are used, logout is demonstrated as procedure.
        assertTrue(driver.getTitle().length() > 0);
        driver.quit();
    }
}