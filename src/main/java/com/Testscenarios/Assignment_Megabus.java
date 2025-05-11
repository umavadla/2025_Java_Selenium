package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Megabus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Assignment_8 [Selenium basics]
				//=================
			//	8.1.
				//https://us.megabus.com/account-management/login
				//type any dummy values 
				//click on Login button


		
	
	  WebDriver driver; driver = new ChromeDriver();
	  driver.get("https://us.megabus.com/account-management/login");
	  driver.findElement(By.id("emailAddress")).sendKeys("uma.vadla@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("uma1234567");
	  Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		
		
	}

}
