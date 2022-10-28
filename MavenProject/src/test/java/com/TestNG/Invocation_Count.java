package com.TestNG;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test (priority = -1)
	private void setProperty() {
		System.out.println("Set Property");
	}
	
	@Test
	private void brower_Launch() {
		System.out.println("browser launch");
	}

	@Test (priority = 1)
	private void get_Url() {
		System.out.println("get Url");
	}

	@Test (invocationCount = 5, priority = 2)
	private void refresh() {
		System.out.println("refresh");
	}

}
