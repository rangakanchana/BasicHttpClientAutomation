package com.ip.rest.BasicRestAutomation;

import static org.testng.AssertJUnit.assertEquals;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class HttpClientRestAutomation {
	
	@Test
	public void geocodeGetRequest(){
		
    HttpUriRequest request = new HttpGet("https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyDITcU9NOiByrNX9jHAFjQUJ-_TH0gY06g");

   
   request.addHeader("content-type","application/json");
   
   try {
	HttpResponse response = HttpClientBuilder.create().build().execute(request);
	
	System.out.println(response.getStatusLine().getStatusCode());
	
	assertEquals(response.getStatusLine().getStatusCode(),HttpStatus.SC_OK);

} catch (Exception e) {
	e.printStackTrace();
}
		
	}
	
	
	
	
  
}
