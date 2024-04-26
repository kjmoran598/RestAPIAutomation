import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.payload;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given - all input details
		//When - Submit the API (resource and http method)
		//Then - Validate the response
		
		//Add place, update place with new address, get place and validate Place ID
		
		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response);
		String placeID = js.get("place_id");
		
		//Update place with new address from placeID
		String newAddress = "555 Burrard St";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\n"
				+ "\"place_id\":\""+ placeID + "\",\n"
				+ "\"address\":\"" + newAddress + "\",\n"
				+ "\"key\":\"qaclick123\"\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"))
		.header("Server", "Apache/2.4.52 (Ubuntu)");
		
		//Use GET API to verify address matches the new address
		
		String verify = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeID).header("Content-Type","application/json")
		.body("")
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jsv = new JsonPath(verify);
		
		String actualAddress = jsv.get("address");
			
		Assert.assertEquals(newAddress, actualAddress);

		

	}

}
