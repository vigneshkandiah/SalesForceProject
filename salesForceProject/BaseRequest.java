package salesForceProject;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseRequest {
	public static String account_ID;
	public static RequestSpecification request;
    @BeforeSuite
	public void initialize() {
		RestAssured.baseURI="https://ap16.salesforce.com/services/data/v20.0/sobjects/Account/";

		RestAssured.authentication= RestAssured.oauth2("00D2w00000DpuY8!AQcAQAflbBTjRvfJ1G5rpkEaZDFcwvtb4HPxhQX6D9RzOdBk7AhyLJsjrmr8VvhCunix4N7JXOVnBEpNoLbOGXGCZONc_FeE");

		 request = RestAssured
				//				.given().contentType("application/json")
				.given()
				.log()
				.all()
				.contentType(ContentType.JSON);


	}

}
