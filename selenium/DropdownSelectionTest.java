package selenium;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownSelectionTest {
    @Test
    public void dropdownTest() {
    	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        driver.switchTo().frame("iframeResult");
        WebElement dropdown = driver.findElement(By.name("cars"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Saab");
        String selected = select.getFirstSelectedOption().getText();
        assertEquals("Saab", selected);
        driver.quit();
    }
}