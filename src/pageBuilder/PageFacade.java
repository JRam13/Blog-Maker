package pageBuilder;

import java.util.ArrayList;
import posts.Post;

//================================================================
//UI Page Facade. This helps provide simple interface to a complex 
//subsystem. A client uses this interface instead of accessing 
//different parts of the generation of html pages.
//================================================================

public class PageFacade {
	static PageFactory newPage = new PageFactory();
	static int option;
	static Post post;
	static ArrayList<Post> allPosts = new ArrayList<Post>();
	
	public static void createAllPages() throws Exception{
		System.out.print("Creating Home Page");
	    Thread.sleep(1000);System.out.print(" . ");Thread.sleep(1000);System.out.print(". ");Thread.sleep(1000);System.out.print(". \n\n");Thread.sleep(1000);
		newPage.makePage("Index", null);
		
		System.out.print("Creating Archive Page");
		newPage.makePage("Archive", null);
	    Thread.sleep(1000);System.out.print(" . ");Thread.sleep(1000);System.out.print(". ");Thread.sleep(1000);System.out.print(". \n\n");Thread.sleep(1000);

		System.out.println("Site Created. Redirecting to Main Menu.\n");
	}

	public static void addPost() {
		/*
		 * First, create the single post object in which the user creates. Then, that post will be transferred into the database
		 * where the returning object will consist of all the posts that exist on that database. This way, the html page
		 * can be created by iterating through each post.
		 */
		
		//go down the layers and fetch a post object
		post = new Post();
		allPosts = post.makePost();
		newPage.makePage("Index", allPosts);
		newPage.makePage("Blog", allPosts);
		newPage.makePage("Archive", allPosts);
	}

	public static void deletePost() {
		/*
		 * In this method, first grab a post object that the user wants to delete. Then, 
		 * return the modified aggregate post list. 
		 * The post.deletePost() calls the Post class and executes these two things.
		 */
		post = new Post();
		allPosts = post.deletePost();
		if(allPosts.isEmpty()) { 
			newPage.makePage("Index", allPosts);
			newPage.makePage("Archive", allPosts);
		}
		else{
			newPage.makePage("Index", allPosts);
			newPage.makePage("Blog", allPosts);
			newPage.makePage("Archive", allPosts);
			
		}
		
	}

	public static void editPost() {
		post = new Post();
		allPosts = post.editPost();
		if(allPosts.isEmpty()) { 
			newPage.makePage("Index", allPosts);
			newPage.makePage("Archive", allPosts);
		}
		else{
			newPage.makePage("Index", allPosts);
			newPage.makePage("Blog", allPosts);
			newPage.makePage("Archive", allPosts);
		}
		
	}
}
