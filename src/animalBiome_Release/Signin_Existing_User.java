package animalBiome_Release;


import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Signin_Existing_User {
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
	public void signin() throws InterruptedException, SQLException{
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("username"))).
		sendKeys("kpranitha@stratapps.com");
		driver.findElement(By.xpath(prop.getProperty("password"))).
		sendKeys("password");
		driver.findElement(By.linkText(prop.getProperty("loginbutton"))).click();
		
	}
}
