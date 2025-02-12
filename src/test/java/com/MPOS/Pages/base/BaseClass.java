package com.MPOS.Pages.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;

    @BeforeSuite
    public void initialization() throws IOException, InterruptedException {

        // Load properties file
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\new_Mpos\\src\\main\\resources\\config.properties");
        prop.load(fis);

        // Get browser and URL from config.properties
        String browserName = prop.getProperty("browser");
        String baseUrl = prop.getProperty("baseUrl");

        // Debugging: Check if properties are loaded
        System.out.println("Browser from config: " + browserName);
        System.out.println("Base URL from config: " + baseUrl);

        // Initialize the correct browser driver
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else {
            System.out.println("Invalid browser specified in config.properties");
            return;
        }

        // Maximize window
        driver.manage().window().maximize();
        //Taking URL from config file.
        driver.get(baseUrl);
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterSuite
    public void tearDown() {
       driver.quit();
    }
}
