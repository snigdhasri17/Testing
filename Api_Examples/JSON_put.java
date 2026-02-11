package Api_Examples;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class JSON_put {
public static void main(String[] args) {
	JSONObject request = new JSONObject();
	request.put("name", "Sowmya");
	request.put("Job", "Trainer1");
	
	given().
		header("Content-Type","application/json").
	header("x-api-key","reqres_7028574cf3734661b8e8a79f8c953f79").
	body(request.toJSONString()).
	when().
	put("https://reqres.in/api/users/2").
	then().
	statusCode(200).log().all();
	
}
}
