import org.testng.Assert;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		//To mock the response, use the payload fake response 
		JsonPath jp = new JsonPath(payload.CoursePrice());
		
		//Print number of courses
		int count = jp.getInt("courses.size()");
		System.out.println(count);
		
		//Print purchase amount
		
		int purchaseAmount = jp.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);
		
		//Print title of first course
		String firstCourse = jp.getString("courses[0].title");
		System.out.println(firstCourse);
		
		//4. Print All course titles and their respective Prices
		for(int i=0; i< count; i++) {
			System.out.println(jp.get("courses["+i+"].title").toString());
			System.out.println(jp.getInt("courses["+i+"].price"));
		}
		
		//5. Print no of copies sold by RPA Course
		for(int i=0; i<count; i++) {
			if(jp.getString("courses["+i+"].title").equals("RPA")) {
				System.out.println(jp.getInt("courses["+i+"].copies"));
				break;
			}
		}
		
		//6. Verify if Sum of all Course prices matches with Purchase Amount
		int sum = 0;
		for(int i=0; i<count; i++)
		{
			sum+=(jp.getInt("courses["+i+"].price")* jp.getInt("courses["+i+"].copies"));
		}
		System.out.println("Added amount = "+ sum);
		int total = jp.getInt("dashboard.purchaseAmount");
		if(sum==total) {
			System.out.println("sum of prices matches total purchase amount");
		}
		Assert.assertEquals(sum, total);
	}
}


//1. Print No of courses returned by API
//
//2.Print Purchase Amount
//
//3. Print Title of the first course
//
//
//
