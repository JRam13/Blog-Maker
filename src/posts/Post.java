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
		
		//get author
		System.out.println("Who is authoring this post?");
		scn = new Scanner(System.in);
		setAuthor(scn.nextLine());
		
		//get post content
		System.out.println("Start typing your post content. \n");
		setContent(scn.nextLine());
			
		//get current Date
	    Date date = new Date();
	    String strDate = String.format("%tc", date );
		setDate(strDate);
		
		//add post to database
		posts = LocalDB.addToDatabase(this);
		
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
	
	

}
