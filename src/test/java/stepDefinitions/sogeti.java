package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sogeti {

    @Given("user on the home page sogeti {string}")
    public void user_on_the_home_page_https_www_sogeti_de(String url) {


    }
    @Then("user gets text")
    public void user_gets_text() {
        System.out.println("texti al");

    }
    @And("user validates text contains {string}")
    public void user_validates_text_contains(String string) {
        System.out.println("assert");


    }

}
