package kjc.grofers.webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kjc.grofers.webMethods.grofersMethods;
import btac.sa.lib.BrowserActions;
import btac.sa.lib.MouseAndKeyboard;
import btac.sa.lib.SelectBrowser;
import btac.sa.lib.WebCommonMethods;

public class grofers extends SelectBrowser {
	WebCommonMethods general;
	grofersMethods loginLogout;
	BrowserActions ba;
	MouseAndKeyboard mk;

	String appserver;
	
	
	@BeforeMethod
    public void openTheBrowser() throws Exception 
    {
    	WebDriver d = getBrowser();
	    loginLogout = PageFactory.initElements(d, grofersMethods.class);
	    general = PageFactory.initElements(d, WebCommonMethods.class);// initiating the driver and the .class file (the pageObject script)	    
	    ba = PageFactory.initElements(d, BrowserActions.class);// initiating the driver and the .class file (the pageObject script)	    
	    mk = PageFactory.initElements(d, MouseAndKeyboard.class);// initiating the driver and the .class file (the pageObject script)	    

	    BrowserActions.openURLBasedOnDbDomain();
    } 

	//validLogin test 
	@Test(priority=1, groups={"loginlogout"})
	public void search() throws Exception
	{	
		System.out.println("************************Grofers started***************************");
		grofersMethods.appenddata();
		System.out.println("++++++++++++++++++++++++Grofers Search success+++++++++++++++++++++++++++");
	}
	
	
	@AfterMethod(alwaysRun=true)
    public void catchExceptions(ITestResult result) throws Exception 
    {    
    	String methodname = result.getName();
        if(!result.isSuccess()){            
        	WebCommonMethods.screenshot(methodname);
        }
        BrowserActions.quit(); // Calling function close to quit browser instance
    }

}
