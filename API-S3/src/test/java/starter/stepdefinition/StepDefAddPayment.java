package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.step.AddNewPaymentMethod;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class StepDefAddPayment {
    @Steps
    AddNewPaymentMethod addNewPaymentMethod;

    @When("I create new payment name as {string}")
    public void CreateNewPayment(String name) {
        addNewPaymentMethod.PaymentMethod(name);
    }

    @Then("I successfull to add the payment method")
    public void SuccessAddNewPayment() {
//        SerenityRest.then()
//                .statusCode(201);

        seeThatResponse("sukses menambahkan payment method baru",
                response -> {
                    response.statusCode(201)
                            .body("name", equalTo("ShopeePay"));
                }
        );

    }
}
