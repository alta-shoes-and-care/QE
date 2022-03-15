package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AllReviews {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/reviews";

    @Step
    public static void ReviewsList() {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }
}
