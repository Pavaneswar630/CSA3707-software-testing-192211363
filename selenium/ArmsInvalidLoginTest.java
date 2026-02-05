package selenium;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ArmsInvalidLoginTest {
    @Test
    public void invalidLoginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("http://arms.sse.saveetha.com/");
            driver.manage().window().maximize();
            
            // 1. Enter Credentials
            driver.findElement(By.id("txtusername")).sendKeys("invaliduser");
            driver.findElement(By.id("txtpassword")).sendKeys("wrongpass");
            
            // 2. Click Button (JS Executor is safer here)
            WebElement loginBtn = driver.findElement(By.id("btnlogin"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", loginBtn);
            
            // 3. Wait for error to appear
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            try {
                // Wait for the word "invalid" (lowercase) which we saw in your log
                wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), "invalid"));
            } catch (Exception e) {
                // Ignore timeout, we check text manually below
            }

            // 4. Get text and convert to LOWERCASE to avoid case issues
            String pageText = driver.findElement(By.tagName("body")).getText().toLowerCase();
            
            System.out.println(">>> CHECKING TEXT: " + pageText);
            
            // 5. Assert (Checking for lowercase words now)
            boolean errorFound = pageText.contains("invalid") || 
                                 pageText.contains("incorrect") || 
                                 pageText.contains("wrong");

            assertTrue("Test Failed: Error message not found. Page text was: " + pageText, errorFound);

        } finally {
            driver.quit();
        }
    }
}