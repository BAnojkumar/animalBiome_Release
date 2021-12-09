package animalBiome_Release;

import java.sql.SQLException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Signup_Newuser {
	
	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("ab_datafile 1.properties");
	
	
	@Test(priority=1, enabled=true)
	public void start() throws InterruptedException {
		
	driver.get(prop.getProperty("baseUrl"));
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath(prop.getProperty("Bannerclick"))).click();
	}
	
	@Test(priority=2,enabled=true)
	public void signup() throws InterruptedException, SQLException {

		
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("signupclick"))).click();
		}
}
