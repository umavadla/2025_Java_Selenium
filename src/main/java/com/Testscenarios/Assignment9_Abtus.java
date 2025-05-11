package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9_Abtus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Go to https://phptravels.com/demo/ Click on About Us link on bottom of the
		 * page
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://phptravels.com");
		driver.manage().window().maximize();
	//	driver.findElement(By.linkText("")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.linkText("About Us")));
		Thread.sleep(8000);
		js.executeScript("arguments[0].click();",driver.findElement(By.linkText("About Us")));
	}
	

}
