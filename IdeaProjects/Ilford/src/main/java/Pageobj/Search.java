package Pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    WebDriver driver;
    @FindBy(name = "submit_search")
    public WebElement CL;


    public Search(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
