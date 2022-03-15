package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.NewOrder;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class StepDefNewOrder {
    @Steps
    NewOrder newOrder;

    @When("I choose service_ID {int} and I input Qty {int} and select payment_method {int}")
    public void InputDataTransaction(int service_ID, int Qty, int payment_method)
    {
        newOrder.DataTransaction(service_ID,Qty,payment_method);
    }
    @And("I choose pickup_date {string} and I input my address {string} and I choose city {string}")
    public void InputDataPickUp(String pickup_date, String address, String city)
    {
        newOrder.DataPickup(pickup_date,address,city);
    }


    @And("Phone_number {string}")
    public void InputContact(String Phone_number)
    {
    newOrder.Contact(Phone_number);
    }

    @Then("I can add order transaction")
    public void AddOrderTransaction()
    {
        seeThatResponse("sukses menambahkan Order baru",
                response -> {
                    response.statusCode(201)
                            .body("ID", equalTo("1"))
                            .body("user_ID", equalTo("9"));
                }
        );
    }
}
