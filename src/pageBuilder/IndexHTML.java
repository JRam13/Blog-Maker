package pageBuilder;


//=================================================
// == Concrete class implementing the Page Interface 
// =================================================

public class IndexHTML implements Page {
	
	//flexible css variable to change styles for future versions (multiple themes)
	//hardcoded for now
	private String css = "html/style/style.css";

	@Override
	public void makeHeader() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeBody() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeFooter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyStyle() {
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
