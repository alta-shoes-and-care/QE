package starter.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class UpdateServices {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/services/jwt";
    @Step
    public static void DataUpdate1 (String title, String description)
    {JSONObject data = new JSONObject();
        data.put("title", title);
        data.put("description", description);

    SerenityRest.given()
            .contentType(ContentType.JSON)
                .body(data.toString())
                .body(title)
                .body(description)
                .log().all()
                .when()
                .put(URLCreate);}


    public static void DataUpdate2 (Integer ID, Integer price)
    {JSONObject data = new JSONObject();
        data.put("ID", ID);
        data.put("price", price);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .body(ID)
                .body(price)
                .log().all()
                .when()
                .put(URLCreate);}
}
