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
			System.out.println("Page Builder: ");
	        System.out.println("--------------------------");
	        
	        //create index page
	        System.out.println("1) Create Home Page");
	        System.out.println("12) Exit \n");
	        
	        Scanner scn = new Scanner(System.in); 
			System.out.println("Choose an option: ");
			
			try {
				option = scn.nextInt();
			} catch (Exception e) {
				System.out.println("Please choose a valid option");
			}
			
			if(option == 1){
				System.out.println("Please enter a title for your Blog. This will be the name of your web site.");
				scn = new Scanner(System.in);
				title = scn.nextLine();
				newPage.makePage("Index", null, title);
			}
			else if(option == 12){
				System.out.println("Goodbye.");
				System.exit(1);
			}
			else{
				System.err.println("Please select a valid option");
			}
		}
		
		//create archive page
		
		//create content page
	}
	
	public static void showPostOptions(){
		
		//add Post
		
		//edit Post
		
		//delete Post
	}
}
