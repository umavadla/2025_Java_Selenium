package com.Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_pqe {

	public static void main(String[] args) throws InterruptedException {
		//8.2
		//	OPEN BELOW url USING cHROME BROWSER
			//https://www.pqe.io/go-signup/
			//TYPE ALL EDITBOXES VALUE(DUMMY VALUE)
//ClICK ON  CUBMIT BUTTTON
		WebDriver driver;
			driver = new ChromeDriver();
		driver.get("https://www.pqe.io/go-signup");
		driver.findElement(By.name("firstName")).sendKeys("UMA");
		driver.findElement(By.name("lastName")).sendKeys("VADLA");
		driver.findElement(By.name("emailAddress")).sendKeys("uma.vadla@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("5715287028");
		driver.findElement(By.name("password")).sendKeys("fhgfhghg");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("fhgfhghg");
		Thread.sleep(5000);
		Select sel = new Select(driver.findElement(By.id("country")));
		sel.selectByVisibleText("UNITED STATES");
		Select sel2 = new Select(driver.findElement(By.name("attendeeType")));
		sel2.selectByVisibleText("High School Student/Future Undergraduate Student");

		Select sel3 = new Select(driver.findElement(By.name("questions[q_134]")));
		sel3.selectByVisibleText("Fall 2023");
		Select sel4 = new Select(driver.findElement(By.id("questions_16_Month")));
		sel4.selectByVisibleText("February");
		Thread.sleep(5000);
		
		  Select sel5 = new Select(driver.findElement(By.id("questions_16_DayOfMonth")));
		  sel5.selectByVisibleText("3");
		  Select sel6 = new Select(driver.findElement(By.id("questions_16_DOBYear")));
		  sel6.selectByVisibleText("2002");
		  Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@class='multiselect']")).click();
		driver.findElement(By.name("questions[q_19][0]")).click();
		driver.findElement(By.name("questions[q_19][2]")).click();
		driver.findElement(By.xpath("//*[@class='multiselect']")).click();
		
		 
		
		Thread.sleep(7000);
		//driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		//Thread.sleep(7000);
	
		driver.findElement(By.id("submit")).click();
		//driver.close();
		  
	}

		
	}


