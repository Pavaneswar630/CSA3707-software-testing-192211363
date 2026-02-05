package selenium;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
public class ScreenshotCaptureTest {
    @Test
    public void captureScreenshot() throws Exception {
    	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://arms.sse.saveetha.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Public\\Pictures\\arms_screenshot.png");
        FileUtils.copyFile(src, dest);
        assertTrue(dest.exists());
        driver.quit();
    }
}
