package edu.manipal.mit.common;

public class DemoClass {

	public static void main(String[] args) {
		// Instantiate the CS Request class
		edu.manipal.mit.services.cs.Request csRequest = new edu.manipal.mit.services.cs.Request();
		csRequest.csMethod();
				
		// Instantiate the ICT Request class
		edu.manipal.mit.services.ict.Request ictRequest = new edu.manipal.mit.services.ict.Request();
		ictRequest.ictMethod();

	}

}
