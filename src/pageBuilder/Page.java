package pageBuilder;

//=============================================================================
//GoF Factory definition:
//The intent of Factory Method is "Define an interface for creating an object, 
//but let subclasses decide which class to instantiate. Factory Method lets a 
//class defer instantiation to subclasses."
//=============================================================================


public interface Page {
	
	// ===============================================
	// == Interface for Page
	// ===============================================
	
	abstract void makeHeader();
	abstract void makeBody();
	abstract void makeFooter();

}
