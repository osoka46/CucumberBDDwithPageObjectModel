package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user navigates to the facebook homepage")
    public void user_navigates_to_the_facebook_homepage() {

    }
    @When("user validates the homepage title")
    public void user_validates_the_homepage_title() {
        System.out.println("user navigates to homepage");

    }
    @Then("user enters {string} username")
    public void user_enters_username(String username) {
        System.out.println(username);

    }
    @And("user enters {string} password")
    public void user_enters_password(String password) {
        System.out.println(password);

    }
    @And("user clicks on the signing button")
    public void user_clicks_on_the_signing_button() {
        System.out.println("user clicking button");

    }
}
