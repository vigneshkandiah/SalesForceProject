package salesForceProject;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;

public class GetAllAccounts extends BaseRequest{
	
	
	
@Test(dependsOnMethods = "salesForceProject.CreateAccount.createAccount")
	
	public void getAllAccounts() {
		
		

		
		Response response = RestAssured.given()
				
				
				.get();
		
		//step 4:Validate the response Code (200 OK)
		
		System.out.println(response.getStatusCode());
		
		if (response.getStatusCode()==200) {
			System.out.println(" The Get Request is Successful");
		}else {
			
			System.out.println(" The Get Request is Not Successful");
		}
		//step 5: Validate the format
		
		String contentType = response.getContentType();
		
		if (contentType.contains("json")) {
			System.out.println(" The format is vald");
		}else {
			
			System.out.println(" The format is not valid");
		}
		
	
		
		response.prettyPrint();
		
		
		
		
		//step 6: Print the Response
		
		
		
		
	}


}
