package salesForceProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.restassured.response.Response;

public class DeleteAccount extends BaseRequest{
	
	//path of method -> pakagename .classname.method
		@Test(dependsOnMethods = "salesForceProject.UpdateAccount.updateAccount")
		@Parameter()
		public void deleteAccount() {
	                 Response response= request
			.given()
					.delete(account_ID);
			int statusCode = response.getStatusCode();
			
			System.out.println(statusCode);
		}

	}


