package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage
{
	//declaration
	//address of gear web element
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	//address of skillrary demo app
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	//address of search text field
	@FindBy(name="q")
	private WebElement serachtb;
	//address of search icon
	@FindBy(xpath="//input[@value='gp']")
	private WebElement serachbtn;
	
	//initialization
	public SkillraryLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}
	public void searchTextbox(String name)
	{
		serachtb.sendKeys(name);
	}
	public void gobutton()
	{
		serachbtn.click();
	}
}

