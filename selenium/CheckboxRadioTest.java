package selenium;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadioTest {
    @Test
    public void checkboxRadioSelection() throws InterruptedException {
        // 1. Setup
    	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");

        // --- PART A: CHECKBOX ---
        // Locate 'Checkbox1' using its ID and click it
        WebElement checkbox = driver.findElement(By.id("vfb-6-0"));
        checkbox.click();
        

        if (checkbox.isSelected()) {
            System.out.println("PASS: Checkbox is selected.");
        } else {
            System.out.println("FAIL: Checkbox is not selected.");
        }

        // --- PART B: RADIO BUTTON ---
        // Locate 'Option 1' radio button using its ID and click it
        WebElement radioButton = driver.findElement(By.id("vfb-7-1"));
        radioButton.click();

        // Verify Radio Button is selected
        if (radioButton.isSelected()) {
            System.out.println("PASS: Radio Button is selected.");
        } else {
            System.out.println("FAIL: Radio Button is not selected.");
        }
        
        // Final Assertion to satisfy JUnit
        assertTrue(checkbox.isSelected());
        assertTrue(radioButton.isSelected());

        // 3. Close
        driver.quit();
    }
}