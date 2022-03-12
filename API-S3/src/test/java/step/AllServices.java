package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AllServices {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/services";

    @Step
    public static void ServiceList(){
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }


}
