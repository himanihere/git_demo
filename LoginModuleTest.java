package loginModule;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginModuleTest extends BaseTest {
	
	@Test(priority=1)
	 public void login_TestCase_without_credentials(){
		  driver.findElement(By.name("Submit")).click();
		  Alert alt=driver.switchTo().alert();
		  alt.accept();
	
    }
	@Test(priority=2)
	 public void login_TestCase_invalidUsername_withoutPassword(){
		  driver.findElement(By.name("txtUserName")).clear();
		  driver.findElement(By.name("txtUserName")).sendKeys("invalid");
		  driver.findElement(By.name("Submit")).click();
		  Alert alt=driver.switchTo().alert();
		  alt.accept();

	}
    @Test(priority=3)
	 public void login_TestCase_validUsername_withoutPassword(){
		  driver.findElement(By.name("txtUserName")).clear();
		  driver.findElement(By.name("txtUserName")).sendKeys("himanib");
		  driver.findElement(By.name("Submit")).click();
		  Alert alt=driver.switchTo().alert();
		  alt.accept();
	}
    
	@Test(priority=4)
	 public void login_TestCase_withoutUsername_invalidPassword(){
		  driver.findElement(By.name("txtUserName")).clear();
		  driver.findElement(By.name("txtPassword")).sendKeys("invalid");
		  driver.findElement(By.name("Submit")).click();
		  Alert alt=driver.switchTo().alert();
		  alt.accept();
	}
	@Test(priority=5)
	 public void login_TestCase_withoutUsername_validPassword(){
		  driver.findElement(By.name("txtUserName")).clear();
		  driver.findElement(By.name("txtPassword")).clear();
		  driver.findElement(By.name("txtPassword")).sendKeys("Sdet@1234");
		  driver.findElement(By.name("Submit")).click();
		  Alert alt=driver.switchTo().alert();
		  alt.accept();
	}
	@Test(priority=6)
	 public void login_TestCase_invalidUsername_invalidPassword(){
		  driver.findElement(By.name("txtUserName")).sendKeys("invalid");
		  driver.findElement(By.name("txtPassword")).clear();
		  driver.findElement(By.name("txtPassword")).sendKeys("invalid");
		  driver.findElement(By.name("Submit")).click();	   
	}
	@Test(priority=7)
	 public void login_TestCase_validUsername_invalidPassword(){
		  driver.findElement(By.name("txtUserName")).clear();
		  driver.findElement(By.name("txtPassword")).clear();
		  driver.findElement(By.name("txtUserName")).sendKeys("himanib");
		  driver.findElement(By.name("txtPassword")).sendKeys("invalid");
		  driver.findElement(By.name("Submit")).click();
	}
	
	@Test(priority=8)
	 public void login_TestCase_invalidUsername_validPassword(){
		 driver.findElement(By.name("txtUserName")).clear();
		  driver.findElement(By.name("txtPassword")).clear();
		  driver.findElement(By.name("txtUserName")).sendKeys("invalid");
		  driver.findElement(By.name("txtPassword")).sendKeys("Sdet@1234");
		  driver.findElement(By.name("Submit")).click();
	}
	@Test(priority=9)
	 public void login_TestCase_validUsername_validPassword(){
		  driver.findElement(By.name("txtUserName")).clear();
		  driver.findElement(By.name("txtPassword")).clear();
		  driver.findElement(By.name("txtUserName")).sendKeys("himanib");
		  driver.findElement(By.name("txtPassword")).sendKeys("Sdet@1234");
		  driver.findElement(By.name("Submit")).click();
		  //Assert.assertEquals(, null);
		  
	}



 
}
