package Task17;
package com.learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		Actions actions = new Actions(driver);
		WebElement signinbutton = driver.findElement(By.xpath("//div[@class='accountInner']"));
		actions.moveToElement(signinbutton).clickAndHold();
		actions.moveToElement(signinbutton).perform();
		Thread.sleep(2000);


		WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]"));
		loginbutton.click();

		
		driver.switchTo().frame("loginIframe");
		driver.switchTo();
		
		Thread.sleep(2000);

		
		WebElement emailid = driver.findElement(By.xpath("//*[@id='userName']"));
		emailid.sendKeys("Hitler20489@gmail.com");
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();

		
		 
		Thread.sleep(2000);
	    WebElement phnnum = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[10]/div[1]/form[1]/div[1]/div[2]/input[1]"));
		phnnum.sendKeys("7603899026");
		Thread.sleep(2000);
		WebElement name =driver.findElement(By.xpath("/html/body/div/div/div/div[10]/div[1]/form/div[2]/input"));
		name.sendKeys("Hitler");

		WebElement password = driver.findElement(By.xpath("//input[@id='j_password']"));
		password.sendKeys("Hitler04");
		WebElement continuebutton  =  driver.findElement(By.xpath("//button[@id='userSignup']"));
		continuebutton.click(); 
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div/div/div[10]/div[2]/form/button")).click();

		
		Thread.sleep(2000);
		WebElement usernamefound = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		usernamefound.getText();
		if (usernamefound.equals(name)) {
			System.out.println(usernamefound.equals(name) + "User Login Successfully in Home page");
		} else {
			System.out.println(usernamefound.equals(name) + "User Login UnSuccessfully");
		}
		
		driver.switchTo().defaultContent();
		// Close the browser
		driver.close();
	}
}




