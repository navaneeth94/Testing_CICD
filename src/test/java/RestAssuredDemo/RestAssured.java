package RestAssuredDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class RestAssured {
	
	/*
	 * public static void main(String[] args) { RestAssured t=new RestAssured();
	 * t.test(); }
	 */
	
	@Test
	public void test() {
		
		Response res=io.restassured.RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		System.out.println("***********");
		System.out.println(res.getTime());
		System.out.println("***********");
		System.out.println(res.getBody().asString());
		System.out.println("***********");
		System.out.println(res.getStatusLine());
		System.out.println("***********");
		System.out.println(res.getHeaders());
		System.out.println("***********");
		System.out.println(res.getSessionId());
		System.out.println("***********");
		System.out.println(res.getClass());
		
		int St=res.getStatusCode();
		Assert.assertEquals(St, 200, "Status_code validation");
		
	}

}
