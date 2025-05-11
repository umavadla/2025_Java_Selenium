package com.Testscenarios;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Assignment123 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * https://autotestdata.com/ Add creditcard columm using Add More element click
		 * on Excel radio button Type Number of Rows as 100 Click on generate button
		 * Click on download butto
		 */
		Date d = new Date();
		System.out.println(d);
		DateFormat df = new SimpleDateFormat("MM ddyyyy_HHmmss");
		String timeStamp=df.format(d);
		System.out.println(timeStamp);
WebDriver driver;
driver = new ChromeDriver();
driver.get(" https://autotestdata.com");

File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//C:\Users\GUESTCST\eclipse-workspace\LearningJavaSelenium_2025
FileHandler.copy(abc, new File(".\\screenshots\\pqeTest_"+timeStamp+".png"));
	}

}
