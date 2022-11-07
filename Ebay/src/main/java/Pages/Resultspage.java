package Pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Base.Base;
import org.testng.annotations.Test;

public class Resultspage extends Base
{
	By total = By.xpath("//h1[@class='srp-controls__count-heading']");
	By results=By.cssSelector("div.s-item__title span");     ////    //div[@class='s-item__title']/span

	public void verifyTotalResults()
	{
	String str=driver.findElement(total).getText();
	System.out.println(str);
	int totalvalue=Integer.parseInt(str.split("\\+")[0].replace(",",""));
	if(totalvalue>=10000)
	{
		System.out.println("total count>10000");
	}
	else
	{
		System.out.println("total count<10000");
	}
	}
	
	public void verifyProductscount()
	{
		List<WebElement> lst = driver.findElements(results);
		List<String> products=new ArrayList<String>();
		for(WebElement x:lst)
		{
			if(x.getText().contains("Portable"))
			{
				products.add(x.getText());
			}
		}
		if(products.size()>=10)
		{
			System.out.println("No of portable products is >=10");
		}
		else
		{
			System.out.println("No of portable products is <10");
		}

	}
	}

