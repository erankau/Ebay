package Base;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{

	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeSuite
	public void initialize()throws Exception
	{
		prop = new Properties();
		prop.load(new FileInputStream("./src/main/java/Config/config.properties"));
	}
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void verifyTitle(String exp)
	{
		if(driver.getTitle().contains(exp))
		{
			System.out.println("Title matches as expected  :"+exp);
		}
		else
		{
			System.out.println("Title not matched as expected  :"+exp);
		}

	}
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}

}

