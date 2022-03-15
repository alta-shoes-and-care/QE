package starter.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class DeleteDataServices {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/services/jwt/1";

    @Step
    public static void deletedata(String name) {
        JSONObject data = new JSONObject();


        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .body(name)
                .log().all()
                .when()
                .delete(URLCreate);
    }

}
