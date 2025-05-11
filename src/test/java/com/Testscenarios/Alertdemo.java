package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertdemo {
  @Test
  public void f() {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("uma.vadla000@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("888888");
	  driver.findElement(By.name("login")).click();
  }
}
