package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazeddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * https://blazedemo.com/ Choose first dropdown as Boston then second drodown
		 * value as London.. Click on FindFlights button
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com");
		driver.manage().window().maximize();
		Select sel =new Select(driver.findElement(By.name("fromPort")));
		sel.selectByValue("Boston");
		Select sel2=new Select(driver.findElement(By.name("toPort")));
		sel2.selectByValue("London");
		driver.findElement(By.xpath("//*[@value='Find Flights']")).click();
	
		
		
	}

}
