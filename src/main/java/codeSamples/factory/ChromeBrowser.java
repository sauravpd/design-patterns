package codeSamples.factory;

public class ChromeBrowser extends Browser
{
	private String browserName;
	public ChromeBrowser(String browserName) 
	{
		this.browserName=browserName;
	}

	@Override
	public String getBrowserName()
	{
		return browserName;
	}
}
