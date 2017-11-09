package kjc.grofers.webMethods;
import java.io.File;

import jxl.Cell;
import jxl.LabelCell;
import jxl.Sheet;
import jxl.Workbook;

import org.hamcrest.CoreMatchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import btac.sa.lib.FilesAndFolders;
import btac.sa.lib.MouseAndKeyboard;
import btac.sa.lib.SelectBrowser;
import btac.sa.lib.WebCommonMethods;

public class grofersMethods extends SelectBrowser {
	
	public static WebDriver driver;
	public grofersMethods(WebDriver driver){
		this.driver=driver;
	}
	
	
	@FindBy(xpath = "html/body/div[1]/div/div[2]/div[2]/header/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[3]")
	public static WebElement blr;
	
	@FindBy(xpath = "html/body/div[1]/div/div[2]/div[2]/header/div[2]/div/div[1]/input")
	public static WebElement searchfield;
	
	@FindBy(xpath = ".//*[@id='app']/div/div[2]/div[2]/header/div[2]/div/div[1]/button")
	public static WebElement search;
	
	@FindBy(xpath = ".//*[@id='app']/div/div[2]/div[4]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/a[1]/div/div[4]/div")
	public static WebElement one;
	@FindBy(xpath = ".//*[@id='app']/div/div[2]/div[4]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/a[2]/div/div[4]/div")
	public static WebElement two;
	@FindBy(xpath = ".//*[@id='app']/div/div[2]/div[4]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/a[3]/div/div[4]/div")
	public static WebElement three;
	@FindBy(xpath = ".//*[@id='app']/div/div[2]/div[4]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/a[4]/div/div[4]/div")
	public static WebElement four;
	@FindBy(xpath = ".//*[@id='app']/div/div[2]/div[4]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/a[5]/div/div[4]/div")
	public static WebElement five;
	@FindBy(xpath = ".//*[@id='app']/div/div[2]/div[4]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/a[6]/div/div[4]/div")
	public static WebElement six;
	@FindBy(xpath = ".//*[@id='app']/div/div[2]/div[4]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/a[7]/div/div[4]/div")
	public static WebElement seven;
	@FindBy(xpath = ".//*[@id='app']/div/div[2]/div[4]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/a[8]/div/div[4]/div")
	public static WebElement eight;
	
	public static void appenddata() throws Exception
	{
		blr.click();
		Thread.sleep(3000);
		
		searchfield.sendKeys("apple");
		Thread.sleep(6000);
		
		search.click();
		Thread.sleep(10000);
		
		//to assert if the title contains apple
		String a = one.getText();
		Assert.assertTrue(a.contains("apple"));
		Thread.sleep(3000);
		
		String b = two.getText();
		Assert.assertTrue(b.contains("apple"));
		Thread.sleep(3000);
		String c = three.getText();
		Assert.assertTrue(c.contains("apple"));
		Thread.sleep(3000);
		String d = four.getText();
		Assert.assertTrue(d.contains("apple"));
		Thread.sleep(3000);
		String e = five.getText();
		Assert.assertTrue(e.contains("apple"));
		Thread.sleep(3000);
		String f = six.getText();
		Assert.assertTrue(f.contains("apple"));
		Thread.sleep(3000);
		String g = seven.getText();
		Assert.assertTrue(g.contains("apple"));
		Thread.sleep(3000);
		String h = eight.getText();
		Assert.assertTrue(h.contains("apple"));
		Thread.sleep(3000);
	}
	
	
	
	
}
