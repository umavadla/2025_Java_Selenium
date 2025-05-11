package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Practice first three Clik me buttons
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	//	Thread.sleep(15000);
		driver.findElement(By.id("confirmButton")).click();
	
		driver.switchTo().alert().accept();
	}

}
