package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeDriverLaunch 
{
	@Test
	public void test() throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		Assert.fail();
		driver.quit();
	}
	
}
