package com.rmg.practise;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class SampleputwithBDD {
	@Test
	public void updateprojectBDD()
	{
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "A.P.J.Abdhul Kalam");
		obj.put("projectName", "Wings Of Fire2");
		obj.put("status", "on going");
	given()
	 .contentType(ContentType.JSON)
	.body(obj)
	.when()
	.put("http://localhost:8084/projects/TY_PROJ_602")
	
	.then()
	   .log().all()
	   .assertThat().statusCode(200)
	   .assertThat().contentType(ContentType.JSON);



}

	
		
	}
