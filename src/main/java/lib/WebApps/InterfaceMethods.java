package lib.WebApps;
import java.util.List;
import org.openqa.selenium.WebElement;

public interface InterfaceMethods {
	
	public interface WebDriverService {

		
		public WebElement locateElement(String locator, String locValue) ;	
		public List<WebElement> locateElements(String locator, String locValue) ;
		public void type(WebElement ele, String data) ;
		public void click(WebElement ele);
		public String getText(WebElement ele);
		public void selectDropDownUsingVisibleText(WebElement ele, String value) ;
		public void selectDropDownUsingValue(WebElement ele, String value) ;
		public void selectDropDownUsingIndex(WebElement ele, int index) ;

		public boolean verifyExactTitle(String expectedTitle);
		public boolean verifyPartialTitle(String expectedTitle);

		public void verifyExactText(WebElement ele, String expectedText);
		public void verifyPartialText(WebElement ele, String expectedText);
		public void verifyExactAttribute(WebElement ele, String attribute, String value);
		public void verifyPartialAttribute(WebElement ele, String attribute, String value);
		
		public void verifySelected(WebElement ele);
		public void verifyDisplayed(WebElement ele);
		
		public void switchToWindow(int index);
		public void switchToFrame(WebElement ele);
		public void acceptAlert();
		public void dismissAlert();
		public String getAlertText();

		public void closeActiveBrowser();		
		public void clickUsingJS(String locator, String locValue);
		public void scrollToElementUsingJS(String locator, String locValue);
		
	}



}
