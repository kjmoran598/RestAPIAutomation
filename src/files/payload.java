package files;

public class payload {

	public static String AddPlace() {
		return "{\n" + "  \"location\": {\n" + "    \"lat\": -38.383494,\n" + "    \"lng\": 33.427362\n" + "  },\n"
				+ "  \"accuracy\": 50,\n" + "  \"name\": \"Morans Dojo\",\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\n" + "  \"address\": \"29, side layout, cohen 09\",\n"
				+ "  \"types\": [\n" + "    \"karate\",\n" + "    \"shop\"\n" + "  ],\n"
				+ "  \"website\": \"http://google.com\",\n" + "  \"language\": \"French-IN\"\n" + "}";
	}

	public static String CoursePrice() {
		return "{\n"
				+ "\n"
				+ "\"dashboard\": {\n"
				+ "\n"
				+ "\"purchaseAmount\": 910,\n"
				+ "\n"
				+ "\"website\": \"rahulshettyacademy.com\"\n"
				+ "\n"
				+ "},\n"
				+ "\n"
				+ "\"courses\": [\n"
				+ "\n"
				+ "{\n"
				+ "\n"
				+ "\"title\": \"Selenium Python\",\n"
				+ "\n"
				+ "\"price\": 50,\n"
				+ "\n"
				+ "\"copies\": 6\n"
				+ "\n"
				+ "},\n"
				+ "\n"
				+ "{\n"
				+ "\n"
				+ "\"title\": \"Cypress\",\n"
				+ "\n"
				+ "\"price\": 40,\n"
				+ "\n"
				+ "\"copies\": 4\n"
				+ "\n"
				+ "},\n"
				+ "\n"
				+ "{\n"
				+ "\n"
				+ "\"title\": \"RPA\",\n"
				+ "\n"
				+ "\"price\": 45,\n"
				+ "\n"
				+ "\"copies\": 10\n"
				+ "\n"
				+ "},\n"
				+ "\n"
				+ "{\n"
				+ "\n"
				+ "\"title\": \"C#\",\n"
				+ "\n"
				+ "\"price\": 60,\n"
				+ "\n"
				+ "\"copies\": 16\n"
				+ "\n"
				+ "}\n"
				+ "\n"
				+ "]\n"
				+ "\n"
				+ "}\n"
				+ "\n"
				+ "";

		}
	
	public static String AddBook() {
		String payload = "{\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\n"
				+ "\"isbn\":\"bcd\",\n"
				+ "\"aisle\":\"2926\",\n"
				+ "\"author\":\"John foer\"\n"
				+ "}";
		return payload;
	}

}
