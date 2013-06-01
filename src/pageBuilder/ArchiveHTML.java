package pageBuilder;

import java.util.ArrayList;

import posts.Post;

//=================================================
//== Concrete class implementing the Page Interface 
//=================================================
public class ArchiveHTML extends Page {

	//============================================================
	//Class Variables
	//============================================================
	private String bodyHTML;
	private final String fileName = "archive.html";

	//============================================================
	//Constructor
	//============================================================
	public ArchiveHTML(ArrayList<Post> allPosts) {
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
				"<a href='index-jquery-1.html' class='logo'><img src='images/mybloglogo.png' /></a>\n" +
				"<!-- ***************** - END LOGO - ***************** -->\n\n\n" +
				
				"<!-- ***************** - Main Navigation - ***************** -->\n" +
				"<ul id='menu-main-nav'>\n" +
				"<li><a href='index.html'><span><strong>Home</strong><span class='navi-description'>welcome home</span></span></a></li>\n" +
				"<li class='current_page_item'><a href='archive.html'><span><strong>Archive</strong><span class='navi-description'>past blog posts</span></span></a></li></ul>\n" +
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
				"<h1>Archive</h1></div><!-- end frame -->\n" +
				"</div><!-- end holder -->\n" +
				"</div><!-- end tools -->\n" +
				"<!-- ***************** - END Title Bar - ***************** -->\n\n\n" +
				
				"<div class='main-holder'>\n\n\n" +
				"<div id='content' class='content_blog'>\n\n\n" +
				
				"<!-- ***************** - START Post - ***************** -->\n" +
				"<h1>No Posts Yet</h1>\n" +

				"<!-- ***************** - END Post - ***************** -->\n\n\n" +
				
				"</div><!-- end content -->\n" +
				"<div id='sidebar' class='sidebar_blog'>\n" +
				
				"<!-- ***************** - START Side Archive - ***************** -->\n" +

				
				"<!-- ***************** - END Side Archive - ***************** -->\n" +
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
				"</div><!-- main-area -->\n\n\n";
	}

}
