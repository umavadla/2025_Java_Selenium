package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demobranch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://autotestdata.com");
		driver.manage().window().maximize();
		//Scroll to the element
		Thread.sleep(1000);
		//Scroll to the element
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();",driver.findElement(By.linkText("Need Help?")));
		
		// TODO Auto-generated method stub

	}

}
