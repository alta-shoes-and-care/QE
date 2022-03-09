package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import step.Register;

public class RegS3 {
    @Steps
    Register register;

    @When("I input my name is {string} and email is {string} and password is {string}")
    public void Reg_User (String name, String email, String password)
        {
        Register.RegisS3 (name,email,password);
        }


    @When("my user is admin")
    public void myUserIsAdmin (Boolean admin){
        myUserIsAdmin(admin = true);
    }


    @Then("I can do register")
    public void iCanDoRegister() {
        SerenityRest.then()
                .statusCode(201);
    }
}





