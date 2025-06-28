package com.inetbanking.testCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class dsfa {
	
	@Test
	public void test() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // optional but recommended
		driver.get("https://demo.guru99.com/V1/index.php");
		
		driver.findElement(By.name("uid")).sendKeys("mngr626148");
		driver.findElement(By.name("password")).sendKeys("AgYhyve");
		driver.findElement(By.name("btnLogin")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Use JS to scroll and click logout
		WebElement logoutLink = driver.findElement(By.linkText("Log out"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logoutLink);
		Thread.sleep(500); // allow scroll animation to complete
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutLink);

		// Optionally, handle the alert popup that appears after logout
		//driver.switchTo().alert().accept();
		
		//driver.quit();
	}
}

