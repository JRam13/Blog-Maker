package database;

import java.util.ArrayList;

import posts.Post;

//================================================================
//Facade for the Database class. Interacts with the Post class.
//================================================================

public interface DatabaseInterface {
	
	public ArrayList<Post> addToDatabase(Post post);
	
	public ArrayList<Post> deleteFromDatabase(Post post);
	
	public ArrayList<Post> editFromDatabase(Post post);
	

}