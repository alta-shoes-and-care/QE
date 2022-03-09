package stepdefinition;

import net.serenitybdd.rest.SerenityRest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.Register;

public class RegisterS3 {
    @Steps
    Register register;

    @When("user input with name is {string} and email is {string} and password is {string} and user is not admin")
    public void Regis_User
            (String name, String email, String password, boolean admin) {

            Register.RegisS3 (name,
                    email,
                    password
            );
        }



    @Then("user successes to register")
    public void userSuccessesToRegister() {
        SerenityRest.then()
                .statusCode(201);
    }


}
