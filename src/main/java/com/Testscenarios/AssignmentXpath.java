package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * 13.1. book a flight ticket. https://blazedemo.com/ Fill all the Attributes
		 * using XPATH Final page content have to print into Console
		 */
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com");
		Select se = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		se.selectByValue("Portland");
		Select se2 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		se2.selectByValue("New York");
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//input[@type='submit' and @value='Choose This Flight'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Last']")).sendKeys("Uma");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("23236 hanworth st");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Ashburn");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("VA");
		driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("20148");
		driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("MasterCard");
		driver.findElement(By.xpath("//input[@name='creditCardMonth']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@name='nameOnCard']")).sendKeys("Uma Devi");
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		String  text=driver.findElement(By.xpath("(//div[@class='container'])[2]")).getText();
	System.out.println(text);

	}

}
