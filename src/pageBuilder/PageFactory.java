package pageBuilder;

import posts.Post;

//=============================================================================
//GoF Factory definition:
//The intent of Factory Method is "Define an interface for creating an object, 
//but let subclasses decide which class to instantiate. Factory Method lets a 
//class defer instantiation to subclasses."
//=============================================================================

//==================================================================
// Factory to generate object of concrete class based on user input.
//==================================================================

public class PageFactory {
	
   //use makePage method to get object of type Page 
   public Page makePage(String pageType, Post post, String title){
      if(pageType == null){
         return null;
      }		
      if(pageType.equalsIgnoreCase("Index")){
         return new IndexHTML(post, title);
      }
      else if(pageType.equalsIgnoreCase("Blog")){
          return new BlogPostHTML(post, title);
       }
      return null;
   }
   
   //use editPage method to edit the body of each page
   
}


