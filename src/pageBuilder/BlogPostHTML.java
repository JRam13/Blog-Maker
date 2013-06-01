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
	private String fileName;

	//============================================================
	//Constructor
	//============================================================
	public BlogPostHTML(ArrayList<Post> allPosts) {
		posts = allPosts;
		css = "../css/style.css";
		cssColor = "../css/karma-cherry.css";
		makeHeader();
		makeBody();
		makeFooter();
		getFileName();
		fw = new PageWriter(headerHTML, bodyHTML, footerHTML, fileName);
	}

	//============================================================
	//Class Methods
	//============================================================
	@Override
	void makeBody() {
		
		bodyHTML = "<body>\n"+
				"<div id='wrapper'>\n"+
				"<div id='header'>\n"+
				"<div class='top-block'>\n"+
				"<div class='top-holder'>\n" +
				"</div><!-- end top-holder -->\n" +
				"</div><!-- end top-block -->\n" +
				"<div class='header-holder'>\n" +
				"<div class='rays'>\n" +
				"<div class='header-area'>\n\n\n" +
				
				"<!-- ***************** - LOGO - ***************** -->\n" +
				"<a href='index-jquery-1.html' class='logo'><img src='../images/mybloglogo.png' /></a>\n" +
				"<!-- ***************** - END LOGO - ***************** -->\n\n\n" +
				
				"<!-- ***************** - Main Navigation - ***************** -->\n" +
				"<ul id='menu-main-nav'>\n" +
				"<li><a href='../index.html'><span><strong>Home</strong><span class='navi-description'>welcome home</span></span></a></li>\n" +
				"<li><a href='../archive.html'><span><strong>Archive</strong><span class='navi-description'>past blog posts</span></span></a></li></ul>\n" +
				"<!-- ***************** - END Main Navigation - ***************** -->\n\n\n" +
				
				"</div><!-- header-area -->\n" +
				"</div><!-- end rays -->\n" +
				"</div><!-- end header-holder -->\n" +
				"</div><!-- end header -->\n" +
				"<div id='main'>\n" +
				"<div class='main-area'>\n\n\n" +
				
				"<!-- ***************** - START Title Bar - ***************** -->\n" +
				"<div class='tools'>\n" +
				"<div class='holder'>\n" +
				"<div class='frame'>\n" +
				"<h1>Full Post</h1></div><!-- end frame -->\n" +
				"</div><!-- end holder -->\n" +
				"</div><!-- end tools -->\n" +
				"<!-- ***************** - END Title Bar - ***************** -->\n\n\n" +
				
				"<div class='main-holder'>\n\n\n" +
				
				"<div id='content' class='content_blog'>\n\n\n" +
				
				"<!-- ***************** - START Post - ***************** -->\n" +
				getPost() + 
				"<!-- ***************** - END Post - ***************** -->\n\n\n" +
				
				"</div><!-- end content -->\n" +
				"<div id='sidebar' class='sidebar_blog'>\n" +
				"<div class='sidebar-widget'>\n\n\n" +
				
				"<h3>Social Networks</h3>\n" +
				"<ul class='social_icons'>\n" +
				"<li><a href='#' class='rss'>rss</a></li>\n" +
				"<li><a href='http://www.twitter.com' class='twitter'>Twitter</a></li>\n" +
				"<li><a href='http://www.facebook.com' class='facebook'>Facebook</a></li>\n" +
				"<li><a href='http://flickr.com' class='flickr'>Flickr</a></li>\n" +
				"<li><a href='http://youtube.com' class='youtube'>YouTube</a></li>\n" +
				"<li><a href='#' class='linkedin'>LinkedIn</a></li>\n" +
				"<li><a href='#' class='foursquare'>FourSquare</a></li>\n" +
				"<li><a href='#' class='delicious'>Delicious</a></li>\n" +
				"<li><a href='#' class='digg'>Digg</a></li>\n" +
				"<li><a href='http://google.com' class='google'>Google +</a></li>\n" +
				"<!-- <li><a href='#' class='email'>Email</a></li> -->\n" +
				"</ul>\n" +
				"</div><!-- end sidebar -->\n" +
				"</div><!-- end main-holder -->\n" +
				"</div><!-- end main-holder -->\n" +
				"</div><!-- main-area -->\n\n\n";
	}
	
	private String getPost() {
		return 
		"<div class='blog_wrap'>\n" +
		"<div class='post_title'>\n" +
		"<h1 style='text-decoration:underline;'>"+posts.get(0).getPostTitle()+"</h1>\n" +
		"<p class='posted-by-text'><span>Posted by:</span> "+posts.get(0).getAuthor()+"</a></p>\n" +
		"</div><!-- end post_title -->\n" +
		"<div class='post_content' >\n" +
		"<p>"+posts.get(0).getContent()+"</p>\n" +
		"<div class='post_date'><span class='day'>"+posts.get(0).getDate().substring(8, 10)+"</span><br /><span class='month'>"+posts.get(0).getDate().substring(4, 7)+"</span></div><!-- end post_date -->\n" +
		"<div class='post_comments'><span>0</span></div><!-- end post_comments -->\n" +
		"</div><!-- end post_content -->\n" +
		"<div class='post_footer'>\n" +
		"<div class='post_cats'>\n" +
		"<p><span>Categories:</span></p>\n" +
		"</div><!-- end post_cats -->\n" +
		"<div class='post_tags'>\n" +
		"<p><span>Tags:</span></p>\n" +
		"</div><!-- end post_tags -->\n" +
		"</div><!-- end post_footer -->\n" +
		"</div><!-- end blog_wrap -->\n" +
		"<br class='clear' />\n" +
		
		"<div class='related_posts'>\n" +
		"<h4>Related Posts</h4>\n" +
		"<ul class='list'>\n" +
		"<li>Feature Coming Soon</li>\n" +
		" </ul>\n" +
		" </div><!-- end related posts -->\n";
	}
	
	private void getFileName() {
		fileName = "blogs/"+posts.get(0).getPostTitle()+posts.get(0).getDate().substring(11, 19)+".html";
		
	}

}
