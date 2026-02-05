package selenium;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ArmsTitleVerificationTest {
    @Test
    public void verifyTitle() {
    	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://arms.sse.saveetha.com/");
        String title = driver.getTitle();
        System.out.println("Website Title: " + title);
        assertTrue(title.length() > 0);
        driver.quit();
    }
}

