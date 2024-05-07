package resreq;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_getReq {
	
	@Test
	void sendReq()
	{
		//Specific URI
		RestAssured.baseURI = "https://reqres.in/"; 
		
		//Request Object
		RequestSpecification httpRequest = RestAssured.given(); 
		
		//Response Object
		Response response = httpRequest.request(Method.GET, "/api/users?page=2\r\n"
				+ "\r\n"
				+ ""); 
		
		//String responseBody = response.getBody().asString(); 
		
		String responseBody = response.getBody().asString(); 
		int statusCode = response.getStatusCode(); 
		Headers responseHeaders = response.getHeaders(); 
		
		System.out.println("Response Body: " + responseBody);
		System.out.println("Status Code: " + statusCode);
		System.out.println("Response Headers: " + responseHeaders);
		
		
		
	}

}
