package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC1 extends Base
{
	@Test
	public void testcase1()
	{
	WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending")));
	}

}
