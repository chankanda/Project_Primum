package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {

	@Test
	private void women() {
		System.out.println("women");
	}

	@Ignore
	@Test
	private void tshirt() {
		System.out.println("tshirt");
	}

	@Test
	private void men() {
		System.out.println("men");
	}

	@Test (enabled = false)
	private void dresses() {
		System.out.println("dresses");
	}
}
