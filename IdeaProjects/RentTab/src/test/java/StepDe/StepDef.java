package StepDe;

import StepE.Stepex;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef
{
    Stepex Rent = new Stepex();
    @Given("^I am on homepage of zoopla$")
    public void i_am_on_homepage_of_zoopla()  {
        // Write code here that turns the phrase above into concrete actions
        Rent.i_am_on_homepage_of_zoopla();
    }

    @When("^I click on rent tab$")
    public void i_click_on_rent_tab()  {
        // Write code here that turns the phrase above into concrete actions
        Rent.i_click_on_rent_tab();
    }

    @When("^enter ilford in search$")
    public void enter_ilford_in_search()  {
        // Write code here that turns the phrase above into concrete actions
        Rent.enter_ilford_in_search();
    }

    @Then("^select three bedroom$")
    public void select_three_bedroom()  {
        // Write code here that turns the phrase above into concrete actions
        Rent.select_three_bedroom();
    }

    @Then("^click on search$")
    public void click_on_search()  {
        // Write code here that turns the phrase above into concrete actions
        Rent.click_on_search();
    }


}
