package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7_food {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://podfoods.co");
		driver.findElement(By.xpath("//*[@id=\"app\"]/header/div/div[4]/div/div[1]/a[1]")).click();
		driver.findElement(By.name("email")).sendKeys("uma.vadla@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12cslfsl");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/form/div[4]/div/div/label[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/form/div[5]/div/button/span")).click();
	}

}
