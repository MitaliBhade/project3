package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyControllerTest {
	
	@Test
	void Name() {
		
		MyController controller = new MyController();
		String response = controller.Name("World");
		assertEquals("Hello " ,response);
	}

}
