package codeSamples.factory;

public class BrowserFactory 
{
	public static Browser getBrowser(String browserType)
	{
		switch (browserType) 
		{
		case "Firefox":
			return new FirefoxBrowser(browserType);
		case "Chrome":
			return new ChromeBrowser(browserType);
		default:
			break;
		}
		return null;
	}
}
