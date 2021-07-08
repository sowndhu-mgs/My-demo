package com.rmg.practise;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SamplepostwithoutBDD {
	@Test
	public void createproject()
	{
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "Kalam");
		obj.put("projectName", "Wings Of Fire");
		obj.put("status", "Completed");
	 RequestSpecification spec=  RestAssured.given();
	 spec.contentType(ContentType.JSON);
	 spec.body(obj);
	Response res= spec.post("http://localhost:8084/addProject");
	
	String allprint= res.prettyPrint();
	System.out.println(allprint);
	int stscode=res.getStatusCode();
	System.out.println(stscode);
	String contype=res.getContentType();
	System.out.println(contype);
}
}