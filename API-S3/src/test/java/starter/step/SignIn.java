package starter.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class SignIn {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/login";

    @Step
    public static void SignIn3(String email, String password) {
        JSONObject data = new JSONObject();
        data.put("email", email);
        data.put("password", password);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .log().all()
                .when()
                .post(URLCreate);
    }
}
