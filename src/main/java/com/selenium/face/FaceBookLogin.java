package com.selenium.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Open chrome browser
		
		//2.facebook home page
		
		System.setProperty("webdriver.chrome.driver", "/home/sivaops7/Devops/selenium/chrome/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//click signin page
		
		WebElement emailBox= driver.findElement(By.name("email"));
		emailBox.sendKeys("sivabalanam91@icloud.com");
		
		WebElement passWord= driver.findElement(By.name("pass"));
		passWord.sendKeys("aru123456$");
		
		WebElement loGin= driver.findElement(By.name("login"));
		loGin.click();
		
		// driver.quit();

	}

}