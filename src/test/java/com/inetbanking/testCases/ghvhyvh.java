package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ghvhyvh {
	
	@Test
	public void test() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr626148");
		driver.findElement(By.name("password")).sendKeys("AgYhyve");
		driver.findElement(By.name("btnLogin")).click();
		//driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(10000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log out")));
		logoutLink.click();
		//driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
	}

}
