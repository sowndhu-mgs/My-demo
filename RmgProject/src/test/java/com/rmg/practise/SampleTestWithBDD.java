package com.rmg.practise;



import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SampleTestWithBDD {

	@Test
	public void getallprojects()	
	{
	when().get("http://localhost:8084/projects")
	.then()
	.assertThat().statusCode(200)
	.and()
	.assertThat().contentType(ContentType.JSON)
	.log().all();
	
}
}
