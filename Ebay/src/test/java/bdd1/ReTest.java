package bdd1;
import Pages.HomePage;
import Pages.Resultspage;
import io.cucumber.java.en.Given;


public class ReTest 
{
	HomePage homepage=new HomePage();
	Resultspage resultpage=new Resultspage();
	public void reTesting()
	{		
		homepage.openurl();
		homepage.search();
		resultpage.verifyTitle("outdoor toys");
		resultpage.verifyTotalResults();
		resultpage.verifyProductscount();
	}

}
