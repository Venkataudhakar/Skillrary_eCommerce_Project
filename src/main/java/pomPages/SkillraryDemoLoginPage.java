package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
	//address of course element
	@FindBy(id="course")
	private WebElement coursetab;
	//address of dropdown web element
	@FindBy(name="addresstype")
	private WebElement coursedd;
	//address of selenium training web element
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	//initialization
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getCoursedd()
	{
		return coursedd;
	}
	public WebElement getCoursetab()
	{
		return coursetab;
	}
	public void seleniumtrainingtab()
	{
		seleniumtraining.click();
	}
}
