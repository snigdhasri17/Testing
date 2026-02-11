package Rest_Assuser;

//import org.testng.annotations.Test;

//import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Bearer_Auth {
	//@Test(enabled=true)
	public static void main(String[] args) {
	//public void two() 
		RestAssured.baseURI = "https://api.github.com/";
		RestAssured.basePath = "/users/snigdhasri17/repos";
		
		RequestSpecification requestspec = RestAssured.given();
		
		
		requestspec.header("Authorization","bearer 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");
		Response res = requestspec.get();
		
		JsonPath jsonpath = res.jsonPath();
		String reposname = jsonpath.getString("name");
		
		System.out.println(reposname);
		Assert.assertEquals(res.statusCode(),200);
	}

}
//}