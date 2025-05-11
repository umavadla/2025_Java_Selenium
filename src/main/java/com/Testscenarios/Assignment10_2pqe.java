package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment10_2pqe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date Of Birth choose any values
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Select sel=new Select(driver.findElement(By.id("yearbox")));
		sel.selectByValue("1928");
		Select sel2=new Select(driver.findElement(By.xpath("//*[@type='text'][@placeholder='Month']")));
		sel2.selectByValue("February");
		Select sel3=new Select(driver.findElement(By.id("daybox")));
		sel3.selectByValue("19");
	}

}