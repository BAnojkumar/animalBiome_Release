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
	
	String str3 = "@analytify.com";
	String str4 = "automated_newuser";



@Test(priority=1, enabled=true)
public void start() throws InterruptedException {
	
driver.get("https://release.animalbiome.com/signin");

driver.manage().window().maximize();
Thread.sleep(4000);
driver.findElement(By.xpath(prop.getProperty("BannerClick_Signup"))).click();
}

@Test(priority=2,enabled=true)
public void signup() throws InterruptedException, SQLException {

	
	Thread.sleep(5000);
	driver.findElement(By.xpath(prop.getProperty("SignupHere"))).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(prop.getProperty("Signup_FN"))).sendKeys("animalBiome");
	Thread.sleep(1000);
	driver.findElement(By.xpath(prop.getProperty("Signup_LN"))).sendKeys("QA_Team");
	Thread.sleep(2000);
	driver.findElement(By.xpath(prop.getProperty("Signup_email"))).sendKeys("banoj@stratapps.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath(prop.getProperty("Signup_password")))
	.sendKeys("password");
	driver.findElement(By.xpath(prop.getProperty("Signup_confirm_pwd")))
	.sendKeys("password");
	Thread.sleep(2000);
	driver.findElement(By.xpath(prop.getProperty("Signup_button")))
	.click();
	Thread.sleep(5000);
	String str1 = "User with this email already exists";
    //identify actual error message
    WebElement m = driver.findElement(By.xpath(prop.getProperty("Signup_msg_capture")));
    String str2 = m.getText();
    //System.out.println("Error message is: "+ str2);
    
    if(str2.contains(str1)) {
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"intro\"]/div/div/div/div[4]/div/div/div/div[2]/form/div[1]/div/div/a"))
    			.click();
    	Thread.sleep(3500);
    	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-signup[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/input[1]"))
    			.clear();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-signup[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/input[1]"))
    			.sendKeys((str4)+System.currentTimeMillis()+"".concat(str3));
    	Thread.sleep(5000);
    	String copiedText = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-signup[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/input[1]"))
    			.getAttribute("value").toString();
    	System.out.println(copiedText);
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-signup[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/button[1]"))
    			.click();
    	Thread.sleep(5000);
    	Actions Signup = new Actions(driver);
      	WebElement Signup_confirm = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/button[1]"));
    	Signup.moveToElement(Signup_confirm).click();
    	Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[3]/div/div[3]/button[1]")) .click();
		Thread.sleep(4000);
    	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"))
    	.sendKeys(copiedText);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]"))
    	.sendKeys("password");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"intro\"]/div/div/div/div[4]/div/div/div/div[2]/form/div[2]/div[1]/div[1]/button"))
    	.click();
        	}
    else {
    	System.out.println("Successfully Signed up to the application");
    	//st.executeUpdate("update Employee set EmpName='Robert' where EmpId=2");
    }
}
}
