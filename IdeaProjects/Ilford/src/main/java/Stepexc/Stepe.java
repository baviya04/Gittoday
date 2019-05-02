
package Stepexc;

import Common.Comm;
import Pageobj.Home;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Stepe extends Comm{

    Home cl=new Home(driver );


    public void i_am_on_homepage_primeloaction()  {
        driver.get("http://automationpractice.com");
        String name=driver.getTitle();
        System.out.println(name);

    }

    public void input_ilford_and_click_search() {
        //driver.findElement(By.id("search_query_top")).sendKeys("Dress");
        cl.sea.click();
        driver.findElement(By.name("submit_search")).click();
        driver.findElement(By.linkText("Printed Summer Dress")).click();
        //driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());

    }


    public void click_Filters_and_Give_third_Bed_in_Beds_Field() {
      new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]"))).selectByVisibleText("M");
              driver.findElement(By.id("add_to_cart")).click();
       driver.findElement(By.linkText("Proceed to checkout")).click();
    }

    public void view_Properties_in_ilford() {

       // driver.findElement(By.linkText("Women")).click();
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Dresses"))).build().perform();
        //driver.findElement(By.linkText("Summer Dresses")).click();

      //  String agent =driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText();


        //driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/h1/b[1]")).sendKeys(agent);
    }


    public void click_on_Find_AGENTS_near_ilford() {

        //driver.findElement(By.linkText("Find agents")).click();
        //driver.findElement(By.name("company_name")).sendKeys("Alliance Property Hub");

    }


    public void findthe_sixth_agent() {

        //driver.findElement(By.id("search-submit")).click();


    }

}