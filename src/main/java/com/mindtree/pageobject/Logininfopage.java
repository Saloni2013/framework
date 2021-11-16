package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logininfopage {
	public WebDriver driver;
	By username=By.name("customer[email]");
	By password=By.name("customer[password]");
	By signin=By.xpath("//button[@type='submit']");
	public Logininfopage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getEmail() {
    	return driver.findElement(username);
    }
	public WebElement getpassword(){
    	return driver.findElement(password);
    }
	public WebElement getsignin(){
    	return driver.findElement(signin);
    }
}
