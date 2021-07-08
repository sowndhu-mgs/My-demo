package com.rmg.practise;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class SampleputwithoutBDD {
	@Test
	public void updateproject()
	{
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "Abdhul Kalam");
		obj.put("projectName", "Wings Of Fire1");
		obj.put("status", "on going");
	 RequestSpecification spec=  RestAssured.given();
	 spec.contentType(ContentType.JSON);
	 spec.body(obj);
	Response res= spec.put("http://localhost:8084/projects/TY_PROJ_602");
	
    ValidatableResponse vresp = res.then();
    vresp.assertThat().statusCode(200);
    vresp.assertThat().contentType("application/json");
    vresp.log().all();

}
}