package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.step.Register;


public class StepDefReg {

    @Steps
    Register register;

    @Given("I input my name is {string} and email is {string} and password is {string}")
    public void dataReg(String name, String email, String password) {
        register.RegisS3(name, email, password);
    }


    @Then("I can do register")
    public void iCanDoRegister() {
        SerenityRest.then()
                .statusCode(201);
    }
}