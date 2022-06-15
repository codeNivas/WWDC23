package Other;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataDriven {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String user, String pwd, String expt){
        driver.get("https://www.instagram.com/");
        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();

        String exp_title = "Instagram";
        String actu_title = driver.getTitle();

        if (exp_title.equals(actu_title)){
            System.out.println("Title is Matching");
        }else {
            System.out.println("Title is Not Matching");
        }
    }

 /*   @DataProvider(name = "LoginData")
    public String[][] getData(){
        String loginData[][]={
                {"pnivaskumar","123456789","Invalid"},
                {"rocksolid","987654321","Invalid"},
                {"nivaskp30@gmail.com","nivi2dead","valid"}
        };
        return loginData;
    } 
   */


    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
