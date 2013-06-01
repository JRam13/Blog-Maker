package pageBuilder;

import java.util.ArrayList;

import posts.Post;


//=================================================
// == Concrete class implementing the Page Interface 
// =================================================
public class IndexHTML extends Page {
	
	//============================================================
	//Class Variables
	//============================================================
	private String bodyHTML;
	private final String fileName = "index.html";

	//============================================================
	//Constructor
	//============================================================
	public IndexHTML(ArrayList<Post> allPosts) {
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
				"<li class='current_page_item'><a href='index.html'><span><strong>Home</strong><span class='navi-description'>welcome home</span></span></a></li>\n" +
				"<li><a href='archive.html'><span><strong>Archive</strong><span class='navi-description'>past blog posts</span></span></a></li></ul>\n" +
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
				"<h1>Welcome To "+title+"</h1></div><!-- end frame -->\n" +
				"</div><!-- end holder -->\n" +
				"</div><!-- end tools -->\n" +
				"<!-- ***************** - END Title Bar - ***************** -->\n\n\n" +
				
				"<div class='main-holder'>\n\n\n" +
				
				"<!-- ***************** - START Banner + Shadow Images - ***************** -->\n" +
				"<div style='margin-left:auto; margin-right:auto' class='shadow_img_frame shadow_banner_full'>\n" +
				"<div class='shadow_preload_full'>\n" +
				"<div class='attachment-fadeIn'><img width='928' height='208' class='thumbnail large_banner_image ' alt='Shortcode Demo' src='images/blogmain.jpg' />\n" +
				"</div><!-- end fade_in -->\n" +
				"</div><!-- end preload -->\n" +
				"</div><!-- end image frame --><br />\n" +
				"<!-- ***************** - END Banner + Shadow Images - ***************** -->\n\n\n" +
				
				"<div id='content' class='content_blog'>\n\n\n" +
				
				"<!-- ***************** - START Post - ***************** -->\n" +
				getPosts() +
				"<!-- ***************** - END Post - ***************** -->\n\n\n" +
				
				"</div><!-- end content -->\n" +
				"<div id='sidebar' class='sidebar_blog'>\n" +
				"<div class='sidebar-widget'>\n\n\n" +
				
				"<!-- ***************** - START Side Archive - ***************** -->\n" +
				"<h3>Archives</h3>\n" +
				"<ul>\n" +
				"<li>No Archives</li>\n" +
				"</ul>\n" +
				"</div>\n\n\n" +
				
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

	private String getPosts() {
		if(posts == null || posts.size() == 0){
			return 
					"<div class='blog_wrap'>\n" +
					"<div class='post_title'>\n" +
					"<h1>No Posts Yet</h1>\n" +
					"</div><!-- end post_footer -->\n" +
					"</div><!-- end blog_wrap -->\n";
		}
		else{
			String allPosts = "";
			int topFive = 0;
			for (Post post : posts) {
				if(topFive < 3){
					allPosts += 
							"<div class='blog_wrap'>\n" +
							"<div class='post_title'>\n" +
							"<h1><a href='#'>"+post.getPostTitle()+"</a></h1>\n" +
							"<p class='posted-by-text'><span>Posted by:</span> "+post.getAuthor()+"</a></p>\n" +
							"</div><!-- end post_title -->\n" +
							"<div class='post_content' >\n" +
							"<p>"+post.getContent()+"</p><a class='ka_button small_button' href='#'><span>Continue Reading -></span></a>\n" +
							"<div class='post_date'><span class='day'>"+post.getDate().substring(8, 10)+"</span><br /><span class='month'>"+post.getDate().substring(4, 7)+"</span></div><!-- end post_date -->\n" +
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
							"</div><!-- end blog_wrap -->\n";
				}
				topFive ++;
			}
			return allPosts;
		}
	}

}
