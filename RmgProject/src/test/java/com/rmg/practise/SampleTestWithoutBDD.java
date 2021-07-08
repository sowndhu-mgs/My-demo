package com.rmg.practise;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTestWithoutBDD {

	@Test
	public void getallprojects()
	{
		Response rsp=RestAssured.get("http://localhost:8084/projects");
		String allprint= rsp.prettyPrint();
		System.out.println(allprint);
		int stscode=rsp.getStatusCode();
		System.out.println(stscode);
		String contype=rsp.getContentType();
		System.out.println(contype);
}
}
