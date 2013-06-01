package pageBuilder;

import posts.Post;

//=============================================================================
//GoF Factory definition:
//The intent of Factory Method is "Define an interface for creating an object, 
//but let subclasses decide which class to instantiate. Factory Method lets a 
//class defer instantiation to subclasses."
//=============================================================================

public abstract class Page {
	private String css = "css/style.css";
	protected Post post;
	protected String headerHTML;
	protected String title;
	protected String footerHTML;
	protected PageWriter fw;
	
	// ===============================================
	//Create Header and Footers (Same for all pages)
	// ===============================================
	
	public void makeHeader() {
		headerHTML = 
				"<!DOCTYPE HTML>\n" +
				"<head>\n" +
				"<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />\n" +
				"<title>"+title+"</title>\n" +
				"<script type='text/javascript' src='js/jquery-1.8.3.js'></script>\n" +
				"<script type='text/javascript' src='js/karma.js'></script>\n" +
				"<link href='"+css+"' rel='stylesheet' type='text/css' />\n" +
				"<link href='css/karma-cherry.css' rel='stylesheet' type='text/css' />\n" +
				"<link rel='shortcut icon' href='template-blog.html#'/>\n" +
				"</head>\n";
	}
	
	public void makeFooter() {
		footerHTML = 
				"<!-- ***************** - Top Footer - ***************** -->\n" +
				"<div id='footer'>\n" +
				"<div class='footer-area'>\n" +
				"<div class='footer-wrapper'>\n" +
				"<div class='footer-holder'>\n\n" +
				
				"</div><!-- footer-holder -->\n" +
				"</div><!-- end footer-wrapper -->\n" +
				"</div><!-- end footer-area -->\n" +
				"</div><!-- end footer -->\n" +
				"<!-- /***************** - END Top Footer Area - ***************** --> \n\n\n" +
				
				"<!-- /***************** - Bottom Footer - ***************** -->\n" +
				"<div id='footer_bottom'>\n" +
				"<div class='info'>\n" +
				"<div id='foot_left'><p>Copyright &copy; 2013 "+title+". All rights reserved.</p>\n" +
				" </div><!-- end foot_left -->\n" +
				"<div id='foot_right'>\n" +
				"<div class='top-footer'><a href='template-blog.html#' class='link-top'>top</a></div>\n" +
				"<ul>\n" +
				"<li><a href='index.html'>Home</a></li>\n" +
				" </ul>\n" +
				"</div><!-- end foot_right -->\n" +
				"</div><!-- end info -->\n" +
				"</div><!-- end footer_bottom -->\n" +
				"<!-- /***************** - END Bottom Footer - ***************** --> \n\n\n" +
				
				"</div><!-- end main -->\n" +
				"</div><!-- end wrapper -->\n" +
				"<script type='text/javascript' src='js/jquery.cycle.all.min.js'></script>\n" +
				"<script type='text/javascript' src='js/jquery-1-slider.js'></script>\n" +
				"<script type='text/javascript' src='js/testimonial-slider.js'></script>\n" +
				"</body>\n" +
				"</html>\n";
	}
	
	//============================================================
	//Abstract Methods (content is dynamic for each page)
	//============================================================
	abstract void makeBody();

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
