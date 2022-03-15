package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AllDataUser {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/users/jwt/";

    @Step
    public static void ListofUsers() {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }
}
