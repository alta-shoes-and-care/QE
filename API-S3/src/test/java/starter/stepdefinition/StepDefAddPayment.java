package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.AddNewPaymentMethod;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class StepDefAddPayment {
    @Steps
    AddNewPaymentMethod addNewPaymentMethod;

    @When("I create new payment as {string}")
    public void CreateNewPayment(String payment) {
        addNewPaymentMethod.PaymentMethod(payment);
    }

    @Then("I successfull to add the payment method")
    public void SuccessAddNewPayment() {
        seeThatResponse("sukses menambahkan payment method baru",
                response -> {
                    response.statusCode(201)
                            .body("name", equalTo("ShopeePay"));
                }
        );

    }
}
