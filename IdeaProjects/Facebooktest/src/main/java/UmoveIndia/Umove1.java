package UmoveIndia;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Umove1 {

    static WebDriver driver;

    @Before
    public void before()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\Facebooktest\\src\\main\\resources\\browserLib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.umoveindia.com/");
    }

    @Test
            public void test()
    {
        String actualtext = "Mumbai, Maharashtra";
             driver.findElement(By.name("typeto")).click();
             new Select(driver.findElement(By.className("select1"))).selectByVisibleText("Flat / Apartment");
               //WebElement element = driver.findElement(By.xpath("//*[@id=\"frmquicksearch\"]/div[1]/table[1]/tbody/tr/td/select[2]"));
            // Select select = new Select(element);
            // select.selectByValue("2");
             new Select(driver.findElement(By.name("numberofbedrooms"))).selectByValue("2");
             driver.findElement(By.name("location")).sendKeys(actualtext);
             driver.findElement(By.xpath("//*[@id=\"frmquicksearch\"]/div[2]/table/tbody/tr[2]/td[1]/p/input\n")).click();
             driver.findElement(By.xpath("//*[@id=\"content-left-big\"]/table[1]/tbody/tr[2]/td[2]/p/a")).click();
String expresult=driver.findElement(By.xpath("//*[@id=\"content-left-big\"]/span")).getText();
Assert.assertEquals(actualtext,expresult);

                 }

    @After
    public void after()
    {
        driver.close();
    }
}

