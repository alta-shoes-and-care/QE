package starter.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class NewOrder {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/orders";

    @Step
    public static void DataTransaction(int service_ID, int Qty, int payment_method) {
        {
            JSONObject data = new JSONObject();
            data.put("service_ID", service_ID);
            data.put("Qty", Qty);
            data.put("payment_method", payment_method);

            SerenityRest.given()
                    .contentType(ContentType.JSON)
                    .body(data.toString())
                    .body(service_ID)
                    .body(Qty)
                    .body(payment_method)
                    .log().all()
                    .when()
                    .post(URLCreate);
        }
    }

    public static void DataPickup(String pickup_date, String address, String city) {
        {
            JSONObject data = new JSONObject();
            data.put("pickup_date", pickup_date);
            data.put("address", address);
            data.put("city", city);

            SerenityRest.given()
                    .contentType(ContentType.JSON)
                    .body(data.toString())
                    .body(pickup_date)
                    .body(address)
                    .body(city)
                    .log().all()
                    .when()
                    .post(URLCreate);
        }
    }

    public static void Contact(String Phone_number)
        {
            JSONObject data = new JSONObject();
            data.put("Phone_number", Phone_number);

            SerenityRest.given()
                    .contentType(ContentType.JSON)
                    .body(data.toString())
                    .body(Phone_number)
                    .log().all()
                    .when()
                    .post(URLCreate);
        }
    }

