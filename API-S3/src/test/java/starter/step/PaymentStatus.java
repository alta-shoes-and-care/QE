package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PaymentStatus {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/orders/check-payment/1";

    @Step
    public static void Status(){
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }
}
