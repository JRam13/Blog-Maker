package pageBuilder;

import java.util.ArrayList;

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
   public Page makePage(String pageType, ArrayList<Post> allPosts){
      if(pageType == null){
         return null;
      }		
      if(pageType.equalsIgnoreCase("Index")){
         return new IndexHTML(allPosts);
      }
      else if(pageType.equalsIgnoreCase("Blog")){
          return new BlogPostHTML(allPosts);
       }
      else if(pageType.equalsIgnoreCase("Archive")){
          return new ArchiveHTML(allPosts);
       }
      return null;
   }
   
   //use editPage method to edit the body of each page
   
}


