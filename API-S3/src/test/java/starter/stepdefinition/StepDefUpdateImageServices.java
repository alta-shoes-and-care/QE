package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import net.thucydides.core.annotations.Steps;
import starter.step.ImageServices;


public class StepDefUpdateImageServices {
    @Steps
    ImageServices imageServices;
    
    @When("I try to upload the image with {string}")
    public void iTryToUploadTheImageWith(String image) {
        imageServices.UpdateImage(image);
            }

    @Then("the image on services data will change")
    public void ImageUpdated() {
        ResponseConsequence.seeThatResponse("sukses memperbarui gambar service",
                response -> {
                    response.statusCode(201);
                }
        );
    }
}
