package pageBuilder;

import java.util.ArrayList;

import posts.Post;

//=================================================
//== Concrete class implementing the Page Interface 
//=================================================
public class BlogPostHTML extends Page {

	//============================================================
	//Class Variables
	//============================================================
	private String bodyHTML;
	private final String fileName = "blog.html";

	//============================================================
	//Constructor
	//============================================================
	public BlogPostHTML(ArrayList<Post> allPosts) {
		posts = allPosts;
		makeHeader();
		makeBody();
		makeFooter();
		fw = new PageWriter(headerHTML, bodyHTML, footerHTML, fileName);
	}

	//============================================================
	//Class Methods
	//============================================================
	@Override
	void makeBody() {
		
		bodyHTML = "";
		
	}

}
