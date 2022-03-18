package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class OrderStatus {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/orders/accept/162";

    @Step
    public static void Status_Order(){
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
//                .body("pending")
                .put(URLCreate);
    }
}
