package browserConfigs;

public class BrowserFlow
{
    public BrowserDriver browserDriver;
    public static BrowserDriver testBrowser(BrowserTypes type)
    {
        switch(type)
        {
            case CHROME: return new ChromeBrowser();
            case FIREFOX: return new FirefoxBrowser();
            case EDGE: return new EdgeBrowser();
            default:
                System.out.println("Wrong Browser selection!!!");
        }
        return null;
    }

}
