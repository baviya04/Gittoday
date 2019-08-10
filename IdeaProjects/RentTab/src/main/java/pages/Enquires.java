package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enquires {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"mbody\"]/section/div/article/article/h2")
    //@FindBy(xpath = "\"//*[@id=\\\"mbody\\\"]/section/div/article/article/h2\"")
    public WebElement enq;


    public Enquires(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}