package posts;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import database.LocalDB;

public class Post {
	//============================================================
	//Class Variables
	//============================================================
	private String postTitle;
	private String author;
	private String content;
	private String date;
	ArrayList<Post> posts;

	//============================================================
	//Constructors
	//============================================================
	public Post(String currTitle, String currAuthor, String currContent, String currDate) {
		this.setPostTitle(currTitle);
		this.setAuthor(currAuthor);
		this.setContent(currContent);
		this.setDate(currDate);
	}

	public Post() {
	}

	//============================================================
	//Class Methods
	//============================================================
	public ArrayList<Post> makePost() {
		//get post info
		//get title
		System.out.println("What is the title of your post?");
		Scanner scn = new Scanner(System.in);
		setPostTitle(scn.nextLine());
		if(this.getPostTitle().isEmpty()) { setPostTitle("(blank)"); }
		
		//get author
		System.out.println("Who is authoring this post?");
		scn = new Scanner(System.in);
		setAuthor(scn.nextLine());
		if(this.getAuthor().isEmpty()) { setAuthor("(blank)"); }
		
		//get post content
		System.out.println("Start typing your post content. \n");
		setContent(scn.nextLine());
		if(this.getContent().isEmpty()) { setContent("(no content)"); }
			
		//get current Date
	    Date date = new Date();
	    String strDate = String.format("%tc", date );
		setDate(strDate);
		System.out.println(strDate);
		
		//add post to database
		posts = LocalDB.addToDatabase(this);
		
		return posts;
		
	}
	
	public ArrayList<Post> deletePost() {
		//fetch all posts from database
		posts = LocalDB.addToDatabase(null);
		
		//list all posts, ask user which to delete
		Post currentPostToDelete = postToDelete();
		posts = LocalDB.deleteFromDatabase(currentPostToDelete);
		
		return posts;
	}

	//============================================================
	//Getters & Setters
	//============================================================
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String newContent) {
		this.content = newContent;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//============================================================
	//Helper Methods
	//============================================================
	private Post postToDelete() {
		int optionB = 0;
		System.out.println("Listing Posts");
        System.out.println("--------------------------");
        
        int count = 1;
        for (Post post : posts) {
            System.out.println(count + ") " + post.getPostTitle() + " - " + post.getDate().substring(11, 19) );
            count++;
        }
        System.out.println();
    	
    	Scanner scn = new Scanner(System.in); 
    	try {
			optionB = scn.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Invalid Selection. Exiting.");
		}
    	
    	count = 1;
    	for (Post post : posts) {
            if(count == optionB){
            	return post;
            }
            count++;
        }
    	return null;
	}

}
