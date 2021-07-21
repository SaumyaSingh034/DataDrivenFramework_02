package dataDrivern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFrameworkPractice1 {
	
	@Test(dataProvider = "toolsLoginData")
	public void passData(String username, String pass)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#userName")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(pass);
		
		driver.findElement(By.id("login")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@DataProvider(name="toolsLoginData")
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "gunjankaushik";
		data[0][1] = "Password@123";
		
		data[1][0] = "saumya";
		data[1][1] = "saumya@shh";
		return data;
	}

}
