package starter.step;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class ImageServices {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/services/jwt/1";

    @Step
    public void UpdateImage(String image)
    {Response res = given()

            .header("Accept", "application/json")
            .header("Content-type", "multipart/form-data")
            .multiPart("file", "shoe repair/png").when()
            .put(URLCreate);

        System.out.println(res.getStatusCode());

        System.out.println(res.jsonPath().prettify());
}
}
