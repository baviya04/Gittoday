package UmoveIndia;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Umove {

    static WebDriver driver;

    @Before
    public void login()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\Facebooktest\\src\\main\\resources\\browserLib\\chromedriver.exe");

        driver =new ChromeDriver();
        driver.get("http://www.umoveindia.com/");
    }

    @Test
            public void test()
    {

        String expectedLocation = "Mumbai, Maharashtra";

        //*[@id="content-left-big"]/table/tbody/tr[2]/td[2]/p/a
        driver.findElement(By.name("location")).sendKeys(expectedLocation);
        driver.findElement(By.name("typeto")).click();
        driver.findElement(By.xpath("//*[@id=\"content-left-big\"]/table/tbody/tr[2]/td[2]/p/a")).click();


       // for the drop out new Select(driver.findElement(By.name("propertytype"))).selectByVisibleText("Flat / Apartment");

       // String actualLocation = driver.findElement(By.xpath("//*[@id=\"content-left-big\"]/table[1]/tbody/tr[1]/td/div[1]")).getText();

       // Assert.assertEquals(expectedLocation, actualLocation);
    }


    @After
    
public void quit()
    {
driver.quit();
    }
}

