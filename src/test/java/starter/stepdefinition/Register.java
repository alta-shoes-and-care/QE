package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class Register {
    @Steps
    starter.step.Register register;


    @When("I input my name is {string} and email is {string} and password is {string}")
    public void Reg_User (String name, String email, String password)
    {
        starter.step.Register.RegisS3 (name,email,password);
    }


    @Then("I can do register")
    public void iCanDoRegister() {
        SerenityRest.then()
                .statusCode(201);
    }
}
