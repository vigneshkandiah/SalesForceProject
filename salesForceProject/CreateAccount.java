package salesForceProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateAccount extends BaseRequest{
	
@Test
	
	public void createAccount() {
		Response response= request
		
				.body("{\"Name\" : \"Suresh Logistics and Transport\"}")
				
				.post();
		int statusCode = response.getStatusCode();
		
		JsonPath jsonPath = response.jsonPath();
		
		account_ID = jsonPath.get("id");
		
		System.out.println(account_ID);
		
		System.out.println(statusCode);
	}

}


