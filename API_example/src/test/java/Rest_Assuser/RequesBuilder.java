package Rest_Assuser;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequesBuilder {
	RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
	//srtting Base url
	reqBuilder.setBaseUri("https://restful-booker.herokuapp.com/");
	//setting base path
	reqBuilder.setBasepath("/booking");
	//Getting RequestSpecificcation reference using builder()method
	RequestSpecification reqSpec = reqBuilder.build();
	
	//usage in different styles
	//we can directly call http verbs on RequestSpecification
	//Response res1 = reqSpec.get());
	//System.out.println(res1.asString());
	System.out.println("==========================");
	//we can also pass RequestSpecification reference variable 
	//given() method
	Response res2 = RestAssured.given(reqSpec).get();
	System.out.println(res2.asString());
	System.out.println("===============");
	
	
}
