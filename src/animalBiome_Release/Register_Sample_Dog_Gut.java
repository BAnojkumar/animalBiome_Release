package animalBiome_Release;

import java.util.Properties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Register_Sample_Dog_Gut {
	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("ab_datafile 1.properties");
	
	@Test(priority=8, enabled=true)
public void register_sample_dog_gut() throws Exception {	
		
		
		
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

driver.findElement(By.xpath(prop.getProperty("p_Register_button"))).click();
Thread.sleep(15000);
driver.findElement(By.xpath(prop.getProperty("p_pet_dropdown"))).click();
driver.findElement(By.xpath(prop.getProperty("p_pet_dropdown"))).sendKeys("Archer_16516653");
Thread.sleep(5000);
driver.findElement(By.xpath(prop.getProperty("p_petselect"))).click();

Select s10=new Select(driver.findElement(By.xpath(prop.getProperty("p_select_sample"))));
s10.selectByValue("gut");

JavascriptExecutor js12 = (JavascriptExecutor) driver;
js12.executeScript("window.scrollBy(0,100)","" );

Thread.sleep(5000);
//s3.selectByValue("oral");
driver.findElement(By.xpath(prop.getProperty("p_sampleid"))).sendKeys("CNF7MK");
driver.findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']")).click();
Thread.sleep(5000);
//driver.findElement(By.xpath("//span[@aria-label='February 8, 2022']")).click();
driver.findElement(By.xpath(prop.getProperty("p_date"))).click();
Thread.sleep(3000);
//js12.executeScript("window.scrollBy(0,500)","" );
//Thread.sleep(3000);

driver.findElement(By.xpath(prop.getProperty("p_antibiotics"))).click();
driver.findElement(By.xpath(prop.getProperty("p_weight_register"))).sendKeys("3");
driver.findElement(By.xpath(prop.getProperty("p_weight_unit_lbs"))).click();
//driver.findElement(By.xpath(prop.getProperty("p_date"))).click();
driver.findElement(By.xpath(prop.getProperty("p_consistancy_image"))).click();
js12.executeScript("window.scrollBy(0,200)","" );
driver.findElement(By.xpath(prop.getProperty("p_fecal_redstreak"))).click();
driver.findElement(By.xpath(prop.getProperty("p_fecal_blood"))).click();
driver.findElement(By.xpath(prop.getProperty("p_animalbiome_suppliments_doggybiome"))).click();
driver.findElement(By.xpath(prop.getProperty("Animalbiome_Gutrestore_30_cap"))).click();
driver.findElement(By.xpath(prop.getProperty("Animalbiome_Gutrestore_60_cap"))).click();
js12.executeScript("window.scrollBy(0,400)","" );
driver.findElement(By.xpath(prop.getProperty("medication_molitary"))).click();
js12.executeScript("window.scrollBy(0,200)","" );
driver.findElement(By.xpath(prop.getProperty("p_molitary_medication_child"))).click();
driver.findElement(By.xpath(prop.getProperty("suppliments_fibre"))).click();
driver.findElement(By.xpath(prop.getProperty("suppiments_fibre_child"))).click();
js12.executeScript("window.scrollBy(0,400)","" );
driver.findElement(By.xpath(prop.getProperty("physical_Gihealth"))).click();
driver.findElement(By.xpath(prop.getProperty("physical_gi_colitics"))).click();
driver.findElement(By.xpath(prop.getProperty("diet_prescription"))).click();
Thread.sleep(500);

driver.findElement(By.xpath(prop.getProperty("p_diet_other"))).click();
driver.findElement(By.xpath(prop.getProperty("p_diet_commercial"))).click();
js12.executeScript("window.scrollBy(0,300)","" );
driver.findElement(By.xpath(prop.getProperty("symptoms_skinissues"))).click();
driver.findElement(By.xpath(prop.getProperty("symptoms_excessive_itching"))).click(); 
js12.executeScript("window.scrollBy(0,300)","" );
Select s2=new Select(driver.findElement(By.xpath(prop.getProperty("p_severity_dropdown"))));
s2.selectByIndex(2);
Select s3=new Select(driver.findElement(By.xpath(prop.getProperty("p_frequency_dropdown"))));
s3.selectByIndex(2);
driver.findElement(By.xpath(prop.getProperty("p_register_submit"))).click();




/*
 * Select s11=new
 * Select(driver.findElement(By.xpath(prop.getProperty("p_fecalconsistancy_drop"
 * )))); s11.selectByIndex(3); JavascriptExecutor js11 = (JavascriptExecutor)
 * driver; js11.executeScript("window.scrollBy(0,300)","" ); Thread.sleep(1000);
 * driver.findElement(By.xpath(prop.getProperty("p_weight"))).sendKeys("3");
 * Thread.sleep(5000);
 * driver.findElement(By.xpath(prop.getProperty("p_kg"))).click(); Select
 * s12=new
 * Select(driver.findElement(By.xpath(prop.getProperty("p_symptoms_dropdown"))))
 * ; s12.selectByIndex(3); Select s13=new
 * Select(driver.findElement(By.xpath(prop.getProperty("p_bodyconditions"))));
 * s13.selectByIndex(3);
 * driver.findElement(By.xpath(prop.getProperty("p_antibiotics_yes"))).click();
 * Thread.sleep(5000); js11.executeScript("window.scrollBy(0,300)", "");
 * Thread.sleep(3000);
 * driver.findElement(By.xpath(prop.getProperty("p_diet"))).click();
 * driver.findElement(By.xpath(prop.getProperty("p_colotics_physical"))).click()
 * ; js11.executeScript("window.scrollBy(0,300)", "");
 * //driver.findElement(By.xpath(prop.getProperty("p_colotics_physical"))).click
 * ();
 * 
 * 
 * driver.findElement(By.xpath(prop.getProperty("p_mental_depression"))).click()
 * ; js11.executeScript("window.scrollBy(0,300)", ""); Thread.sleep(3000);
 * driver.findElement(By.xpath(prop.getProperty("p_sympt_diarrhea"))).click();
 * Thread.sleep(3000);
 * driver.findElement(By.xpath(prop.getProperty("p_sample_submit"))).click();
 * Thread.sleep(10000);
 */
} }



