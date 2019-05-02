package StepD;

import Stepexc.Stepe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class IlfordSte {

    Stepe Stepil=new Stepe();

    @Given("^I am on homepage primeloaction$")
    public void i_am_on_homepage_primeloaction() {
        // Write code here that turns the phrase above into concrete actions
Stepil.i_am_on_homepage_primeloaction();
    }

    @Then("^input ilford and click search$")
    public void input_ilford_and_click_search() {
        // Write code here that turns the phrase above into concrete actions
Stepil.input_ilford_and_click_search();
    }

    @Then("^Click Filters and Give third Bed in Beds Field$")
    public void click_Filters_and_Give_third_Bed_in_Beds_Field() {
        // Write code here that turns the phrase above into concrete actions
Stepil.click_Filters_and_Give_third_Bed_in_Beds_Field();
    }

    @Then("^View Properties in ilford$")
    public void view_Properties_in_ilford() {
        // Write code here that turns the phrase above into concrete actions
Stepil.view_Properties_in_ilford();
    }

    @Then("^Click on Find AGENTS near ilford$")
    public void click_on_Find_AGENTS_near_ilford() {
        // Write code here that turns the phrase above into concrete actions
Stepil.click_on_Find_AGENTS_near_ilford();
    }

    @Then("^Findthe sixth agent$")
    public void findthe_sixth_agent() {
        // Write code here that turns the phrase above into concrete actions
Stepil.findthe_sixth_agent();
    }
}