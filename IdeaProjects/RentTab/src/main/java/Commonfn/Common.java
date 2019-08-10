package Commonfn;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Common {
    public static WebDriver driver;
    public void open(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\RentTab\\src\\main\\resources\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void close(){
        driver.close();

    }
}
