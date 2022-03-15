package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ServicesByID {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/services/67";

    @Step
    public static void CheckServicesID(){
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }
}
