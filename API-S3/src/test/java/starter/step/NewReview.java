package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class NewReview {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/reviews/jwt";

    @Step
    public static void ReviewSubmitted(){
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }
}
