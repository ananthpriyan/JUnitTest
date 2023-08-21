package org.junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chrome= new ChromeOptions();
		chrome.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(chrome);
		
		driver.get("https://www.omrbranch.com/");
		String title = driver.getTitle();
		
		System.out.println("Hi Anand:"+title);
		System.out.println("Hi Kavi:"+title);
		System.out.println("Hi Vennila:"+title);
		
	}
	
}
