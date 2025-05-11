package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForm {

	//public static void main(String[] args) throws InterruptedException {
public static void main(String[] args) throws InterruptedException {
	

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("uma");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("vadla");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("uma.vadla@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("5715287028");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]")).click();
		Thread.sleep(50);
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		Thread.sleep(50);
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		Thread.sleep(50);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a"))
				.click();
		Thread.sleep(50);
		driver.findElement(By.xpath("//*[@id=\"Skills\"]")).click();
//driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a")).click();

	}
}
