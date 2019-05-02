package Pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

    WebDriver driver;
    @FindBy(id = "search_query_top")
            public WebElement sea;


 public Home(WebDriver driver)
 {
     this.driver=driver;
     PageFactory.initElements(driver,this);
 }
}

