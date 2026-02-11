package Api_Examples;

//import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class JSONsite_overview {
//@Test
//void JSON_demo() {
	public static void main(String[] args) {
	baseURI = "https://reqres.in/api";
	given().header("x-api-key","reqres_7028574cf3734661b8e8a79f8c953f79").
	get("users?page=2").
	then().statusCode(200).
	body("data[0].first_name",equalTo("Sowmya"))
	.body("data.first_name",hasItems("Sowmya","pokuri"));
}
}
//output will excute the actual and excepted output it equal.
//JSON Path Finder for json overview.