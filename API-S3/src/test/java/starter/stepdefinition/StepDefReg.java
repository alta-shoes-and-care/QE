package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.step.Register;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;


public class StepDefReg {

    @Steps
    Register register;

    @Given("I input my name is {string} and email is {string} and password is {string}")
    public void dataReg(String name, String email, String password) {
        register.RegisS3(name, email, password);
    }


    @Then("I can do register")
    public void iCanDoRegister() {
        seeThatResponse("sukses menambahkan user baru",
                response -> {
                    response.statusCode(201)
                            .body("name", equalTo("Adhit"))
                            .body("email", equalTo("adhit99@cc.co"))
                            .body("password", equalTo("Axx999"))
                            .body("is_admin", equalTo("false"));

                }
        );
    }
}