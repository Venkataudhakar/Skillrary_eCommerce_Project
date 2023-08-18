package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities
{
	//Handling Drop Down
	public void dropDown(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);		
	}
	//Handling mouse over
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//Handling double click
	public void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	//Handling right click
	public void rightClick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	//Handling drag and drop
	public void dragdrop(WebDriver driver, WebElement src, WebElement target)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}
	//Shifting control to Frame
	public void switchFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	//Shifting control to normal web page
	public void switchbackFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	//Shifting control to pop-up
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	//Shifting control to child window
	public void switchingtabs(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for (String b : child) 
		{
			driver.switchTo().window(b);
		}
	}
	//Handling scroll bar
	public void scrollBar(WebDriver driver, int x, int y)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
	}
}
