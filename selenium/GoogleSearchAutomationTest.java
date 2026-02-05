package selenium;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearchAutomationTest {
    @Test
    public void googleSearchTest() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Saveetha School of Engineering" + 
Keys.ENTER);
        Thread.sleep(3000);
        assertTrue(driver.getTitle().contains("Saveetha"));
        driver.quit();
    }
}
