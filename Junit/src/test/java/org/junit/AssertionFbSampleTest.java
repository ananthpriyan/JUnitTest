package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionFbSampleTest {

	
	@Test
	public void fbtest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String url = driver.getCurrentUrl();
		boolean contains = url.contains("facebook");
		System.out.println(contains);
		
		Assert.assertTrue(contains);   //
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("ananth@123");
		
		String attribute = txtEmail.getAttribute("value");
		
		Assert.assertEquals("kavi",attribute);  //false     ananth@123!=kavi
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("kavi@123");
		
		WebElement btnClick = driver.findElement(By.name("login"));
		btnClick.click();
		
		
		
		
		
		
		
		
		
		

	}
}
