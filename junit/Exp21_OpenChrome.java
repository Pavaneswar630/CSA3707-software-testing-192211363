package junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp21_OpenChrome {
    public static void main(String[] args) {
        
        // FIX 1: Point to YOUR chromedriver path
        // (We changed this from your faculty's path to yours)
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");

        // FIX 2: Initialize the driver
        WebDriver driver = new ChromeDriver();
        
        // Open Google
        driver.get("https://www.google.com");
        
        // Optional: Print title to confirm
        System.out.println("Opened: " + driver.getTitle());
    }
}