package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CommonBase {
    static WebDriver driver;

    public void launchChrome(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        System.out.println("Chrome Browser Launched.");
    }
    public void maxWindow(){
        driver.manage().window().maximize();
    }
    public void closeWindow(){
        driver.close();
    }



}