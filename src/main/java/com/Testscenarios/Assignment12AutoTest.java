package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*https://autotestdata.com/
Add creditcard columm using Add More element
click on Excel radio button
Type Number of Rows as 100
Click on  generate button
Click on download button*/

public class Assignment12AutoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://autotestdata.com/");
		//Thread.sleep(9000);
		driver.findElement(By.xpath("//button[@type='button' and @title='Select Data Type']")).click();
		//Thread.sleep(9000);
		driver.findElement(By.xpath("(//span[text()='Credit Card'])[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"exampleRadios10\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"total-rows-gen\"]")).sendKeys("100");
		driver.findElement(By.xpath("//input[@id='total-rows-gen' and @placeholder='Enter number']")).clear();
		driver.findElement(By.xpath("//input[@id='total-rows-gen' and @placeholder='Enter number']")).sendKeys("100");
		driver.findElement(By.xpath("//div[@class='btn btn-primary at-btn-background generate-data']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@class='btn bt-primary at-btn-background download-btn']")).click();
	}
	
}
