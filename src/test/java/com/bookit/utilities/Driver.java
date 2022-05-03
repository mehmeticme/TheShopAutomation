package com.bookit.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {


    private static WebDriver driver;
    public static WebDriver getDriver() {
        // browser type can come from properties file or commend line.
        if (driver == null) {
            String browser = System.getProperty("browser") != null ? System.getProperty("browser")
                    : ConfReader.getProperty("browser");
            switch (browser) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
            }

            driver.manage().window().fullscreen();
        }

        return driver;
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
