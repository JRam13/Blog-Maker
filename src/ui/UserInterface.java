package ui;

import java.io.File;

import pageBuilder.PageFacade;

public class UserInterface {
	private static boolean siteExists;
	
	//============================================================
	//MAIN METHOD
	//============================================================

	public static void main(String[] args) throws Exception {
		
		System.out.println("===========================================");
		System.out.println("Welcome To Blog-Maker");
	    System.out.println("===========================================\n");
		
		//check to see if framework html files exists
	    System.out.println("Checking for pages ...\n");
		siteExists = doesSiteExist();
		
		//if files don't exist, ask user to create site pages
		if(!siteExists){
			PageFacade.showPageBuildOptions();
		}
		
		//else show posts option
		else {
			PageFacade.showPostOptions();
		}
		
	}

	//============================================================
	//Class Methods
	//============================================================
	
	private static boolean doesSiteExist() {
		File f = new File("html/index.html");
		if(!f.exists()) { return false;}
		return true;
	}
}
