package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AllOrders {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/orders";

    @Step
    public static void IncomingOrders() {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }



}

