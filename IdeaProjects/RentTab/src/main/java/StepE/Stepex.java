package StepE;

import Commonfn.Common;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.Enquires;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class Stepex  extends Common {

    HomePage hp=new HomePage(driver);
    Enquires en=new Enquires(driver);

    public void i_am_on_homepage_of_zoopla() {
        driver.get("https://www.zoopla.co.uk/");
    }

    public void i_click_on_rent_tab() {

        //driver.findElement(By.linkText("My enquiries")).click();
        hp.myEnqBtn.click();
    }

    public void enter_ilford_in_search() {

       //String act= driver.findElement(By.xpath("//*[@id=\"mbody\"]/section/div/article/article/h2")).getText();
        String act =en.enq.getText();
       String exp="You haven't sent any enquiries yet";
       assertEquals(exp,act);
        //driver.findElement(By.id("ui-id-2")).click();
    }

    public void select_three_bedroom() {
        //new Select(driver.findElement(By.id("beds_min"))).selectByVisibleText("3");

    }


    public void click_on_search() {

        //driver.findElement(By.id("search-submit")).click();
    }
}
