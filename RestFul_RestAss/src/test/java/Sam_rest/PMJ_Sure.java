package Sam_rest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PMJ_Sure {
	@Test
	void rest_get() {
		baseURI = "https://app.reqres.in/api";
		given().header("x-api-key","reqres_7028574cf3734661b8e8a79f8c953f79").
		get("/users?page=2").then().statusCode(200).log().all();
	}
	}


