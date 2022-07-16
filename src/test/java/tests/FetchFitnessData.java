package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class FetchFitnessData extends BaseTest{
	String tokenValue = "7077bb7682076fcc66068cf2e4c1d879205ee36c";
	

	
	@Test
	public void GetData() {
		RestAssured
		.given()
		.when()
		.contentType(ContentType.JSON)
		.queryParam("access_token", tokenValue)
		.get("/activities")
		.then()
		.log()
		.all()
		.statusCode(200);
	}
	

}
