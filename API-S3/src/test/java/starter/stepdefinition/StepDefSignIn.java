package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.step.SignIn;

public class StepDefSignIn {
    @Steps
    SignIn signIn;

    @When("I input my email is {string} and password is {string}")
    public void InputEmailAndPassword(String email, String password) {
        signIn.SignIn3( email, password);

    }

    @Then("I can login to page")
    public void LoginToPage() {
        SerenityRest.then()
                .statusCode(200);
    }
}
