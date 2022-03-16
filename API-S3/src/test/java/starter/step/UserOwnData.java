package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class UserOwnData {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/users/jwt/me";

    @Step
    public static void Owner() {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }
}
