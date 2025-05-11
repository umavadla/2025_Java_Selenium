package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Assignment113 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * https://www.grammarcheck.net/editor/ Click on Clear Editor icon (Delete icon)
		 * Get the confirmation ALert text then click Cancel button
		 */
RemoteWebDriver driver;
driver = new ChromeDriver();
driver.get(" https://www.grammarcheck.net/editor/");
Thread.sleep(7000);

driver.findElement(By.xpath("//*[@id=\"editor-area\"]/div[1]/div[3]/div[2]")).sendKeys("asddadf");
driver.findElement(By.xpath("//*[@id=\"clear-1\"]")).click();
driver.switchTo().alert().accept();
	}

}
