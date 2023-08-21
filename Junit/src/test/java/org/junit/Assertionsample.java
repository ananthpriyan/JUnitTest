package org.junit;

public class Assertionsample {
	
	
	
	@Test
	public void tc1() {
		
		System.out.println("TC1");

	}

	@Test
	public void tc2() {
		
		System.out.println("TC2");

	}
	
	@Test
	public void tc3() {
	
		System.out.println("TC3");
		
		//Assertion
		Assert.assertTrue(false);
		
		System.out.println(1);
		System.out.println(2);
		
		Assert.assertEquals("Hello", "Hello");
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

	}
}
