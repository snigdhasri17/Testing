package Rest_Assuser;

import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;

public class Oauth_auth {
public static void main(String[] args) {
	RestAssured.baseURI="https://api.github.com/";
	String ep = "/users/snigdhasri17/repos";
	String token = "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";
	ResponseOptions res2 = (ResponseOptions)RestAssured.given()
			.auth().oauth2(token).get(ep).getBody();
	System.out.println(res2.toString());
			
}
	
}
