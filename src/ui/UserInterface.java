package ui;

import java.io.File;

import pageBuilder.PageFacade;

public class UserInterface {
	PageFacade pf = new PageFacade();
	private static boolean siteExists;
	
	//============================================================
	//MAIN METHOD
	//============================================================

	public static void main(String[] args) throws Exception {
		
		System.out.println("===========================================");
		System.out.println("Welcome To Blog-Maker");
	    System.out.println("===========================================\n");
		
		//check to see if html files exists
		siteExists = doesSiteExist();
		System.out.println(siteExists);
		
		//if files don't exist, ask user to create pages
		
		//else show posts option
		
	}

	private static boolean doesSiteExist() {
		File f = new File("html/index.html");
		if(!f.exists()) { return false; }
		return true;
	}
}
