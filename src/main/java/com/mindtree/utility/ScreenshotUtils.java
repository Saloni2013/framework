package com.mindtree.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.SimpleLayout;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.base;

public class ScreenshotUtils extends base {
	//public static  WebDriver driver;

	public  static void  getscreenshots(String result,String path) throws IOException {
		Date d=new Date();
		SimpleDateFormat f1= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss");
		//SimpleLayout layout=new SimpleLayout();
		String screenshotfilename=f1.format(d).toString();
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+path+"//" + screenshotfilename +result+".png"));
	}

}
