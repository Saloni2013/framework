package com.mindtree.runner;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.pageobject.Hindibooks;
import com.mindtree.pageobject.Logininfopage;
import com.mindtree.pageobject.login;
import com.mindtree.reusablecomponents.base;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
public class homepage extends base {
	static Logger log;

	@BeforeMethod
	public void init() throws IOException {
		log = Logger.getLogger(homepage.class.getName());
		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\MITALI\\eclipse-workspace\\pracFramework\\src\\main\\resources\\data.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		extent = new ExtentReports(System.getProperty("user.dir") + "/log/result.html", true);
		LOG = extent.startTest("init");
	}

	@Test(priority = 2)
	public void pick() throws IOException {

		Hindibooks hb = new Hindibooks(driver);
		hb.gethindibooks().click();
		Assert.assertTrue(false);
		hb.getcheck().click();
	}

	@Test(priority = 1, dataProvider = "getdata")
	public void hitUrl(String username, String password) throws IOException {
		login l = new login(driver);
		l.getlogin().click();
		log.info("clicked");
		Logininfopage lp = new Logininfopage(driver);
		lp.getEmail().sendKeys(username);
		lp.getpassword().sendKeys(password,Keys.ENTER);
		LOG.log(LogStatus.PASS,"test case passed and we successfully logged in");
		extent.endTest(LOG);
		extent.flush();
		
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[1][2];
		data[0][0] = "imsaloni@gmail.com";
		data[0][1] = "12233";
		return data;

	}
	@AfterMethod
	public void closebrowser(){
		driver.quit();
	}
}
