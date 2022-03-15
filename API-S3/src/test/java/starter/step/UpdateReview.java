package starter.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class UpdateReview {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/reviews/jwt/1";
    @Step
    public static void DataReviewEdited (String rating, String review)
    {
        JSONObject data = new JSONObject();
        data.put("title", rating);
        data.put("description", review);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .body(rating)
                .body(review)
                .log().all()
                .when()
                .put(URLCreate);}
}
