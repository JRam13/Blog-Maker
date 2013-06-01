package pageBuilder;

import posts.Post;


//=================================================
// == Concrete class implementing the Page Interface 
// =================================================
@SuppressWarnings("unused")
public class IndexHTML implements Page {
	
	
	//============================================================
	//Class Variables
	//============================================================
	//flexible css variable to change styles for future versions (multiple themes)
	//hardcoded for now
	private String css = "html/css/style.css";
	private Post post;
	private String title;
	private String headerHTML;
	private PageWriter fw;
	private final String fileName = "index.html";

	//============================================================
	//Constructor
	//============================================================
	public IndexHTML(Post newPost, String newTitle) {
		this.post = newPost;
		this.title = newTitle;
		makeHeader(title);
		writeFile();
		fw = new PageWriter(headerHTML, null, null, fileName);
	}

	//============================================================
	//Class Methods
	//============================================================
	@Override
	public void makeHeader(String blogTitle) {
		headerHTML = 
				"<!DOCTYPE HTML>\n" +
				"<head>\n" +
				"<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />\n" +
				"<title>"+blogTitle+"</title>\n" +
				"<script type='text/javascript' src='js/jquery-1.8.3.js'></script>\n" +
				"<script type='"+css+"' src='js/karma.js'></script>\n" +
				"<link href='css/style.css' rel='stylesheet' type='text/css' />\n" +
				"<link href='css/karma-cherry.css' rel='stylesheet' type='text/css' />\n" +
				"<link rel='shortcut icon' href='template-blog.html#'/>\n" +
				"</head>\n";
	}

	@Override
	public void makeBody() {
		
	}

	@Override
	public void makeFooter() {
		
	}

	@Override
	public void applyStyle() {
		
	}
	
	private void writeFile() {
		// TODO Auto-generated method stub
		
	}

	//=============================================================
	//Getters and Setters for stylesheets. (For future theming use)
	//=============================================================
	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

}
