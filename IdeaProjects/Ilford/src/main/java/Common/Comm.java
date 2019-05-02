package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Comm {
public static WebDriver driver;
    public void open() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\Ilford\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void close() {

        driver.close();

    }
}