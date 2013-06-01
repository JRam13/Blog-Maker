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
	private String css = "css/style.css";
	private Post post;
	private String title;
	private String headerHTML;
	private String bodyHTML;
	private String footerHTML;
	private PageWriter fw;
	private final String fileName = "index.html";

	//============================================================
	//Constructor
	//============================================================
	public IndexHTML(Post newPost, String newTitle) {
		this.post = newPost;
		this.title = newTitle;
		makeHeader(title);
		makeBody(title);
		writeFile();
		fw = new PageWriter(headerHTML, bodyHTML, footerHTML, fileName);
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
				"<script type='text/javascript' src='js/karma.js'></script>\n" +
				"<link href='"+css+"' rel='stylesheet' type='text/css' />\n" +
				"<link href='css/karma-cherry.css' rel='stylesheet' type='text/css' />\n" +
				"<link rel='shortcut icon' href='template-blog.html#'/>\n" +
				"</head>\n";
	}

	@Override
	public void makeBody(String bodyTitle) {
		
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
				"<li class='current_page_item'><a href='#'><span><strong>Home</strong><span class='navi-description'>welcome home</span></span></a></li></ul>\n" +
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
				"<div class='blog_wrap'>\n" +
				"<div class='post_title'>\n" +
				"<h1>No Posts Yet</h1>\n" +
				"</div><!-- end post_footer -->\n" +
				"</div><!-- end blog_wrap -->\n" +
				"<!-- ***************** - END Post - ***************** -->\n\n\n" +
				
				"</div><!-- end content -->\n" +
				"<div id='sidebar' class='sidebar_blog'>\n" +
				"<div class='sidebar-widget'>\n" +
				"<h3>Archives</h3>\n" +
				"<ul>\n" +
				"<li><a href='template-blog.html#' title=''>May 2011</a></li>\n" +
				"<li><a href='template-blog.html#' title=''>April 2011</a></li>\n" +
				"<li><a href='template-blog.html#' title=''>March 2011</a></li>\n" +
				"</ul>\n" +
				"</div>" +
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
				"</div><!-- main-area -->\n";
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
