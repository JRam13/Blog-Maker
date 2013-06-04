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

public class LocalDB implements DatabaseInterface {
	static ArrayList<Post> currentState;
	static ArrayList<Post> allPosts = new ArrayList<Post>();

	public ArrayList<Post> addToDatabase(Post post) { //append post to database
		//get current state of databse
		getCurrentState();
		
		//append post information to document
		appendToDocument(post);
		
		//write to database and return all posts
		if(post != null){
			writeToDB();
		}
		return allPosts;
		
	}
	
	public ArrayList<Post> deleteFromDatabase(Post post) {
		//get the current state of database
		getCurrentState();
		
		//delete from database
		delete(post);
		
		//update the database
		writeToDB();
		
		return allPosts;
	}
	
	public ArrayList<Post> editFromDatabase(Post post) {
		//get the current state of database
				getCurrentState();
				
				//delete from database
				edit(post);
				
				//update the database
				writeToDB();
				
				return allPosts;
	}

	private static void getCurrentState() {
		//this method grabs the current state of the database, before modifying.
		currentState = new ArrayList<Post>();
		try {
			Scanner dbScanner = new Scanner (new File("html/database/database.csv"));
			dbScanner.useDelimiter(",");
			while(dbScanner.hasNextLine()){
				Scanner string = new Scanner (dbScanner.nextLine());
				string.useDelimiter(",");
				Post currentPost = new Post();
				currentPost.setDate(string.next());
				currentPost.setPostTitle(string.next());
				currentPost.setAuthor(string.next());
				currentPost.setContent(string.next());
				currentState.add(currentPost);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't open file");
		}
		
	}

	private static void appendToDocument(Post post) {
		PostIterator iterator = new PostIterator(currentState);
		if(post == null){
			allPosts = currentState;
		}
		else{
			allPosts = iterator.add(post);
		}
		
	}
	
	private static void delete(Post post) {
		PostIterator iterator = new PostIterator(currentState);
		while(iterator.hasNext())
			if(iterator.next().getDate().equals(post.getDate())){
				allPosts = iterator.delete();
			}
		
	}
	
	private static void edit(Post post) {
		PostIterator iterator = new PostIterator(currentState);
		while(iterator.hasNext())
			if(iterator.next().getDate().equals(post.getDate())){
				allPosts = iterator.edit(post);
			}
		
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
