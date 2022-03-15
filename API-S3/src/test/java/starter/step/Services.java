package starter.step;


import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;


import java.io.File;


import static net.serenitybdd.rest.SerenityRest.given;


public class Services {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/services/jwt";

    @Step
   public void form(String tittle, String description, String price, String upload)
    {
        Response res = given()

                .header("Accept", "application/json")
                .header("Content-type", "multipart/form-data")
                .formParam("tittle", "service 1")
                .formParam("description", "layanan 1")
                .formParam("price", "10000")
                .multiPart("file", "Men-Shoes/png").when()
                .post(URLCreate);

        System.out.println(res.getStatusCode());

        System.out.println(res.jsonPath().prettify());
        }
    }

