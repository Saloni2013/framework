package com.mindtree.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;


public class log extends FileAppender {
	public void setFile(String file) {
		if (file.contains("%timestamp")) {
			Date d=new Date();
			SimpleDateFormat f1= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss");
			file=file.replaceAll("%timestamp", f1.format(d));
		}
		super.setFile(file);
	}
}