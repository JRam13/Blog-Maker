package pageBuilder;

//==================================================================
// Factory to generate object of concrete class based on user input.
//==================================================================

public class PageFactory {
	
   //use makePage method to get object of type Page 
   public Page makePage(String pageType){
      if(pageType == null){
         return null;
      }		
      if(pageType.equalsIgnoreCase("Index")){
         return new IndexHTML();
      }
      return null;
   }
}


