package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class OrderbyID {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/orders/1";

    @Step
    public static void OrderID() {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }
}
