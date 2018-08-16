package codeSamples.factory;

public class FactoryTest 
{
	public static void main(String[] args) 
	{
		Browser chromebrowser=BrowserFactory.getBrowser("Chrome");
		System.out.println("Browser Name: "+chromebrowser.getBrowserName());
		
		Browser firefoxbrowser=BrowserFactory.getBrowser("Firefox");
		System.out.println("Browser Name: "+firefoxbrowser.getBrowserName());
	}
}
