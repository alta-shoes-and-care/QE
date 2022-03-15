package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AllpaymentMethod {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/payments";

    @Step
    public void PaymentMethod(){
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }

}
