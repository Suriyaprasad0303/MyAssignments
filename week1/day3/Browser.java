package week1.day3;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser br=new Browser();
		br.launchBrowser("Microsoft Edge");
		br.loadUrl();

	}
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
	
	}
	
	public void loadUrl() 
	{
		System.out.println("Application url loaded successfully");
	}

}
