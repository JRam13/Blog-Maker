package pageBuilder;

import posts.Post;

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
      return null;
   }
   
   //use editPage method to edit the body of each page
   
}


