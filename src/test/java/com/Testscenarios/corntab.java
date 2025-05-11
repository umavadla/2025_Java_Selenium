package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class corntab {
  @Test
  public void f() {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://crontab.guru/");
	  driver.findElement(By.xpath("//*[text()='@weekly']"));
	  
  }
}
