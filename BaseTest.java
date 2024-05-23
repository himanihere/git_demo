package loginModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("http://182.76.176.205/hrm/login.php");
		driver.manage().window().maximize();
	}
	
	/*@AfterSuite
	public void  closure() {
		driver.quit();
		
		
	}*/
	
}
