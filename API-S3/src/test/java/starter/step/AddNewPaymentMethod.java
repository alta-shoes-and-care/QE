package starter.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class AddNewPaymentMethod {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/payments";

    @Step
    public static void PaymentMethod(String name) {
        JSONObject data = new JSONObject();
        data.put("name", name);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .body(name)
                .log().all()
                .when()
                .post(URLCreate);
    }
}
