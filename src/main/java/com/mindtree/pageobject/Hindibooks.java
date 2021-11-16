package com.mindtree.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.reusablecomponents.base;

public class Hindibooks {
	 public WebDriver driver;
	 By bookfind=By.linkText("HINDI BOOKS");
	 By check=By.xpath("//span[@class='filter-text']");
	 By language=By.cssSelector("a[href*='grow-rich']");
			 
			 public Hindibooks(WebDriver driver) {
		this.driver=driver;
	}
		
		
		public WebElement gethindibooks() {
			return driver.findElement(bookfind);
		}
		public WebElement getcheck() {
			return driver.findElement(check);
		}
		public WebElement getlanguage() {
			return driver.findElement(language);
		}
	}
