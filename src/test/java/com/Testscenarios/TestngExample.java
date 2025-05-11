package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngExample {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		driver =new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		Thread.sleep(7000);
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(7000);
		driver.findElement(By.name("userName")).sendKeys("uma");
		Thread.sleep(7000);
		driver.findElement(By.name("password")).sendKeys("umareddy70");
  }
}
