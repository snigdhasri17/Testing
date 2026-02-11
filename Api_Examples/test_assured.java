package Api_Examples;

//import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class test_assured {

	public static void main (String[] args) {
	//@Test		//using tentNG it was not excuting instead we use main method.
	//void rest_get() {
		
		//get() method :------
	baseURI = "https://reqres.in/api/";
		given().header("x-api-key","reqres_7028574cf3734661b8e8a79f8c953f79").get("users?page=2").
		then().statusCode(200).log().all();
		
		
	}
	// same get() method but using STRING IT WILL PRINT it in a line
/*	RequestSpecification httpRequest = RestAssured.given();
	httpRequest.header("x-api-key","reqres_7028574cf3734661b8e8a79f8c953f79");
	httpRequest.baseUri("https://reqres.in/api/");
	Response response = httpRequest.get("users?page=2");
	
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusCode());
	
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	
	int code = response.getStatusCode();
	Assert.assertEquals(code,201);
	
}*/
		
	
	
	
	
}

