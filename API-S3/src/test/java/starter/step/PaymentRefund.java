package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PaymentRefund {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/orders/refund/156";

    @Step
    public static void refund(int id) {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .put(URLCreate);
    }
}
