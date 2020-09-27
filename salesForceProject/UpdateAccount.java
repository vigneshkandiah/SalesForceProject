package salesForceProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class UpdateAccount extends BaseRequest{
	
	@Test (dependsOnMethods ="salesForceProject.CreateAccount.createAccount")
	public void updateAccount() {
		Response response= request
//				
				.body("{\"BillingCity\" : \"San Francisco\"}")
				.accept(ContentType.JSON)
				
				
				.patch(account_ID);
		int statusCode = response.getStatusCode();
		
		
		
		System.out.println(statusCode);
	}
	

}
