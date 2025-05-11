package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11retail {

	public static void main(String[] args) throws InterruptedException {
	
		/*
		 * https://retail.onlinesbi.sbi/retail/login.htm# Clik on 'CONTINUE TO LOGIN'
		 * button click on LOGIN button without fill any test data fields Get the alert
		 * text then click on OK button on Alert
		 */
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		Thread.sleep(5000);
		driver.findElement(By.className("login_button")).click();
		driver.findElement(By.name("userName")).sendKeys("uma");
		driver.findElement(By.name("password")).sendKeys("umareddy70");
		//driver.findElement(By.)

	}

}
