package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

@FindBy(linkText = "My enquiries")
    public WebElement myEnqBtn;

public HomePage(WebDriver driver)
{

     this.driver=driver;
    PageFactory.initElements(driver, this);

}


}
