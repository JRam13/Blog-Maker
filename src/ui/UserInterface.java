package ui;

import java.io.File;
import java.util.Scanner;

import pageBuilder.PageFacade;

public class UserInterface {
	static boolean siteExists;
	static int option;
	
	//============================================================
	//MAIN METHOD
	//============================================================

	public static void main(String[] args) throws Exception {
		
		System.out.println("===========================================");
		System.out.println("Welcome To Blog-Maker");
	    System.out.println("===========================================\n");
		
		//check to see if framework html files exists
	    System.out.print("Checking for pages");
	    //add cool animating effect
	    Thread.sleep(1000);System.out.print(" . ");Thread.sleep(1000);System.out.print(". ");Thread.sleep(1000);System.out.print(". \n\n");Thread.sleep(1000);
		siteExists = doesSiteExist();
		
		while(option != 12){
			//if files don't exist, ask user to create site pages
			if(!siteExists){
				System.out.println("Site Builder: ");
		        System.out.println("--------------------------");
		        
		        //create the homepage and archive pages
		        System.out.println("1) Create All Pages");
		        System.out.println("12) Exit \n");
		        
		        Scanner scn = new Scanner(System.in); 
				System.out.println("Choose an option: ");
				
				try {
					option = scn.nextInt();
				} catch (Exception e) {
					System.out.println("Please choose a valid option 1 ");
				}
				
				if(option == 1){
					PageFacade.createAllPages();
					siteExists = true;
				}
				else if(option == 12){
					System.out.println("GoodBye.");
					System.exit(1);
				}
				else{
					System.err.println("Please select a valid option 2 ");
				}
			}
			else{
				//site now exists/was created- show post options
				System.out.println("Blog Post Dashboard: ");
		        System.out.println("--------------------------");
		        
		        //give user option to add, edit, or delete a post
		        System.out.println("1) Add Post");
		        System.out.println("2) Edit Post");
		        System.out.println("3) Delete Post");
		        System.out.println("12) Exit \n");
		        
		        Scanner scn = new Scanner(System.in); 
				System.out.println("Choose an option: ");
				
				try {
					option = scn.nextInt();
				} catch (Exception e) {
					System.out.println("Please choose a valid option 3");
				}
				
				if(option == 1){
					PageFacade.addPost();
				}
				else if(option == 2){
					PageFacade.editPost();
				}
				else if(option == 3){
					PageFacade.deletePost();
				}
				else if(option == 12){
					System.out.println("GoodBye.");
					System.exit(1);
				}
				else{
					System.err.println("Please select a valid option 2 ");
				}
			}
		}
	}

	//============================================================
	//Helper Methods
	//============================================================
	
	private static boolean doesSiteExist() {
		File f = new File("html/index.html");
		if(!f.exists()) { System.out.println("Pages Not Found. Build Your Site First.\n"); return false;}
		System.out.println("Pages found. Taking you to Post Dashboard.\n");
		return true;
	}
}
