package com.mindtree.utility;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.hpsf.Date;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners extends ScreenshotUtils implements ITestListener{
	//private static Logger log=LogManager.getLogger(listeners.class);
	public void onTestFailure(ITestResult result) {
		try {
			getscreenshots(result.getName(),"FAIL");
		}catch(IOException e) {
			e.printStackTrace();
	}
}
}