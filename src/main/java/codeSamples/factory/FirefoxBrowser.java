package codeSamples.factory;

public class FirefoxBrowser extends Browser
{
	private String browserName;
	public FirefoxBrowser(String browserName) 
	{
		this.browserName=browserName;
	}

	@Override
	public String getBrowserName()
	{
		return browserName;
	}
}
