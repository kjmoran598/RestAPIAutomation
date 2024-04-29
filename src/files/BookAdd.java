package files;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;

import io.restassured.response.Response;


public class BookAdd {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
		String response = given().log().all().header("Content-Type","application/json").body(payload.AddBook())
				.when().post("/Library/Addbook.php")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
		JsonPath js = new JsonPath(response);
		
		String bookID = js.get("ID");
		
		System.out.println("ISBN = "+bookID);
		
	}
}
