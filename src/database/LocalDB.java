package database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import posts.Post;

//=================================================================
//This is our local database object. The objective here is to store 
//=================================================================

public class LocalDB {
	static ArrayList<Post> currentState;
	static ArrayList<Post> allPosts = new ArrayList<Post>();

	public static ArrayList<Post> addToDatabase(Post post) { //append post to database
		//get current state of databse
		getCurrentState();
		
		//append post information to document
		appendToDocument(post);
		
		//write to database and return all posts
		writeToDB();
		return allPosts;
		
	}

	private static void getCurrentState() {
		currentState = new ArrayList<Post>();
		try {
			Scanner dbScanner = new Scanner (new File("html/database/database.csv"));
			dbScanner.useDelimiter(",");
			while(dbScanner.hasNextLine()){
				Scanner string = new Scanner (dbScanner.nextLine());
				string.useDelimiter(",");
				Post currentPost = new Post();
				currentPost.setDate(string.next());
				System.out.println(currentPost.getDate());
				currentPost.setPostTitle(string.next());
				System.out.println(currentPost.getPostTitle());
				currentPost.setAuthor(string.next());
				System.out.println(currentPost.getAuthor());
				currentPost.setContent(string.next());
				System.out.println(currentPost.getContent());
				currentState.add(currentPost);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't open file");
		}
		
	}

	private static void appendToDocument(Post post) {
		PostIterator iterator = new PostIterator(currentState);
		allPosts = iterator.add(post);
		
	}
	
	private static void writeToDB() {
		try
		{
		    String filename= "html/database/database.csv";
		    FileWriter fw = new FileWriter(filename);
		    BufferedWriter br = new BufferedWriter(fw);
		    
		    for (Post post : allPosts) {
		    	br.write(post.getDate() + "," + post.getPostTitle() + "," + post.getAuthor() + "," + post.getContent());
		    	br.newLine();
			}
		    br.close();
		    fw.close();
		}
		catch(IOException ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}
	}

}
