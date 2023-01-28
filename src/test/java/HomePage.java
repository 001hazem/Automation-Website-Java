import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class HomePage {
    protected static ChromeDriver driver;

    @BeforeClass
    public void setUp(){

//        ChromeOptions options = new BrowserOptions().getOptions(true);
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sgs.dcetest.com/en");
    }
    @Test
        public void VerifyTheButtonIsFUNCTIONALITY(){
        WebElement ButtonSign_In= HomePOM.Button_Is_Clickable();
        Assert.assertTrue(ButtonSign_In.isDisplayed());
        ButtonSign_In.click();

    }


    @Test
    public void VerifyTheSignIn(){
        WebElement userName = driver.findElementById("email");
        WebElement password=driver.findElementById("password");
        WebElement login = driver.findElementById("btn_submit");
        userName.sendKeys("hazemkhamis001@gmail.com");
        password.sendKeys("Hazem@1230.");
        login.click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);



    }

//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }


}
