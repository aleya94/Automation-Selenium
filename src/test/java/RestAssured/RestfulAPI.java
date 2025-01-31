package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestfulAPI {

	public static void main(String[] args) {
		
		//perform a GET request using REST Assured
		Response response = RestAssured.get("https://restfulapi.net/");
		System.out.println(response.getStatusCode());

	}

}
