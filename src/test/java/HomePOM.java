import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePOM {

    static public WebElement Button_Is_Clickable(){
        return HomePage.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/ul/li/a"));
    }

    static public WebElement Logo(){
        return HomePage.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/h1/a/img"));
    }

    static public WebElement CheckTitle(){
        return HomePage.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/h1/a/img"));
    }

}
