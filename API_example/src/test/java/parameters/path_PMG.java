package parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

//import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class path_PMG {

//@Test
public static void main(String[] args){
	baseURI = "https://reqres.in/api/";
	
	given().header("x-api-key","reqres_7028574cf3734661b8e8a79f8c953f79")
	.pathParam("resource","users")//
	.queryParam("page", 2)//.when()
	
	.get("/{resource}").
	then().statusCode(200)//.log().all().
	.body("data[0].first_name",equalTo("Sowmya"))
	.body("data.first_name",hasItems("Sowmya","pokuri"));
}
}

