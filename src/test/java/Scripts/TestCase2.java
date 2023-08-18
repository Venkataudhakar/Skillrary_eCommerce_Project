package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilies.dropDown(sd.getCoursedd(),pdata.getPropertydata("courseadd"));
		TestingPage tp=new TestingPage(driver);
		utilies.dragdrop(driver, tp.getSeleniumtraining(), tp.getCarttab());
	}
}
