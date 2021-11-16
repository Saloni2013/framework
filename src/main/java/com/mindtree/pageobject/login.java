package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	public WebDriver driver;
	By login=By.cssSelector("a[href*='login']");
    
	public login(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getlogin() {
    	return driver.findElement(login);
    }

}
