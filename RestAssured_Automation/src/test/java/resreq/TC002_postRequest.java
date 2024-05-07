package resreq;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_postRequest {
	
	@Test
	void postRequest()
	{
		RestAssured.baseURI = "https://reqres.in/"; 
		
		RequestSpecification Httprequest = RestAssured.given(); 
		
		//Request Object
		Response response = Httprequest.request(Method.POST, "/api/users"); 
		
		// Request Payload sending along with Post Request 
		JSONObject requestParams = new JSONObject(); 
		requestParams.put("email", "marcus.east@gmail.com"); 
		requestParams.put("first_name", "Marcus");
		requestParams.put("last_name", "East");
		requestParams.put("avatar", "https://reqres.in/img/faces/7-image.jpg"); 
		
		Httprequest.header("Content-Type", "abc"); 		
		Httprequest.body(requestParams.toJSONString()); 
		
		int statusCode = response.statusCode(); 
		System.out.println("Status Code: " + statusCode);
		
		String responseContentType = response.getContentType().toString(); 
		String responseBody = response.getBody().toString(); 
		Headers responseHeaders = response.getHeaders(); 
		
		System.out.println(responseContentType);
		System.out.println("responseBody: " + responseBody);
		System.out.println("Response Headers: " + responseHeaders);
		
		
		
		
		
		
		
	}

}
