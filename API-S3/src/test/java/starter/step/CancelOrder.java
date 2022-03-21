package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CancelOrder {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/orders/cancel/76";

    @Step
    public static void cancel(int ID) {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .put(URLCreate);
    }
}