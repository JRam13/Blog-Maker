package pageBuilder;

import java.util.Scanner;

//================================================================
//UI Page Facade. This helps provide simple interface to a complex 
//subsystem. A client uses this interface instead of accessing 
//different parts of the generation of html pages.
//================================================================

public class PageFacade {
	static PageFactory newPage = new PageFactory();
	static int option;
	static String title;
	
	public static void showPageBuildOptions(){
		
		while(option != 12){
			System.out.println("Site Builder: ");
	        System.out.println("--------------------------");
	        
	        //create the homepage, blog content page, and archive pages
	        System.out.println("1) Create All Pages");
	        System.out.println("12) Exit \n");
	        
	        Scanner scn = new Scanner(System.in); 
			System.out.println("Choose an option: ");
			
			try {
				option = scn.nextInt();
			} catch (Exception e) {
				System.out.println("Please choose a valid option");
			}
			
			if(option == 1){
				System.out.println("Creating Home Page...\n");
				System.out.println("Please enter a title for your Blog. \nThis will be the name of your web site.\n");
				scn = new Scanner(System.in);
				title = scn.nextLine();
				newPage.makePage("Index", null, title);
				
				System.out.println("Creating Blog Content Page...\n");
				newPage.makePage("Blog", null, title);
				
				
			}
			else if(option == 12){
				System.out.println("Goodbye.");
				System.exit(1);
			}
			else{
				System.err.println("Please select a valid option");
			}
		}
	}
	
	public static void showPostOptions(){
		
		//add Post
		
		//edit Post
		
		//delete Post
	}
}
