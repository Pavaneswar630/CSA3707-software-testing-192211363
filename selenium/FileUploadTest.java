package selenium;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadTest {
    @Test
    public void fileUploadAutomation() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload"))
                .sendKeys("C:\\Users\\dhana\\Downloads\\sample.txt");
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(2000);
        String uploaded = driver.findElement(By.id("uploaded-files")).getText();
        assertTrue(uploaded.contains("sample.txt"));
        driver.quit();
    }
}
