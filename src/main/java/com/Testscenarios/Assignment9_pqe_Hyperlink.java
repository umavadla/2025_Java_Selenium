package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9_pqe_Hyperlink {

	public static void main(String[] args) {
	
		/*
		 * Assignment#9(Hyperlinks) ================= 9.1. Go to URL
		 * https://www.pqe.io/go-signup/ Click on 'terms & conditions' link on bottom of
		 * the page
		 */
WebDriver driver;
driver = new ChromeDriver();
driver.get(" https://www.pqe.io/go-signup");
driver.findElement(By.linkText("terms & conditions")).click();


	}

}
