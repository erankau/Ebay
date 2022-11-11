package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Base.Base;


public class HomePage extends Base
{
	By serachbar = By.xpath("//input[@placeholder='Search for anything']");
	
	public void openurl()
	{
		driver.get(prop.getProperty("url"));
	}
	
	public void search()
	{
		driver.findElement(serachbar).sendKeys("outdoor toys");
		driver.findElement(serachbar).sendKeys(Keys.ENTER);
	}

}
