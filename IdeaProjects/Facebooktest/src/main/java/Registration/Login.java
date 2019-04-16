package Registration;

import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

    Faker faker1=new Faker();

static WebDriver driver;
    @Before
    public void beforetest() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\Facebooktest\\src\\main\\resources\\browserLib\\chromedriver.exe");

    driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
}

@Test
    public void loginpage()
{
    driver.findElement(By.name("firstname")).sendKeys(faker1.firstName());
    driver.findElement(By.name("lastname")).sendKeys(faker1.lastName());
    driver.findElement(By.name("reg_email__")).sendKeys(faker1.phoneNumber());
    driver.findElement(By.name("reg_passwd__")).sendKeys("kashik£3");
    new Select(driver.findElement(By.id("day"))).selectByVisibleText("11");
    new Select(driver.findElement(By.id("month"))).selectByValue("4");
    new Select(driver.findElement(By.id("year"))).selectByValue("2015");

    driver.findElement(By.name("sex")).click();
    driver.findElement(By.id("u_0_11")).click();

}

@After
        public void close()
{
    driver.quit();
}
}
