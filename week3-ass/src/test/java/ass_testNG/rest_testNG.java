package ass_testNG;

import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import static io.restassured.RestAssured.*;
	import static org.hamcrest.Matchers.*;
	
	
	
//public static void main(String[] args) {
	public class rest_testNG {
	    // STEP 1: Set Base URI
	   
	  public static String baseURI = "https://reqres.in";
	    public static String  Token = "reqres_7028574cf3734661b8e8a79f8c953f79";
	    
	
	

	    // STEP 2: DataProvider supplying multiple user IDs
	   @DataProvider(name = "userid")
	    public Object[][] userid() {
	        return new Object[][] {{1},
	        	{2},
	        	{3}
	        	};
	    }

	    // STEP 3: Test using DataProvider
	   @Test (dataProvider = "userid")
	    public void validateUser(int userid) {

	        given().header("x-api-key","reqres_7028574cf3734661b8e8a79f8c953f79").
	        pathParam("id",userid).
	        when().get("/api/users/{id}" )

	        .then()
	        //HTTP status code tell us what happened to the request.
	        
	            .statusCode(404) ;                // Validate status
	            //.body("data.id", equalTo(id));   // Validate correct user returned
	    }
	}

	
	
		