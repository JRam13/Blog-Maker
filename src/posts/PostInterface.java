package posts;

import java.util.ArrayList;

//================================================================
//Facade for the Post class. Interacts with the PageBuilder class.
//================================================================

public interface PostInterface {

	//============================================================
	//Class Methods
	//============================================================
	public ArrayList<Post> makePost();

	public ArrayList<Post> deletePost();

	public ArrayList<Post> editPost();

}