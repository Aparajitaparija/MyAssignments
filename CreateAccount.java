package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("(//input[@id='accountName'])")).sendKeys("Debit Limited Account AA");
		driver.findElement(By.xpath("(//textarea[@name='description'])")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("(//input[@name='groupNameLocal'])")).sendKeys("A");
		driver.findElement(By.xpath("(//input[contains(@id,'office')])")).sendKeys("Tree");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("3241");
		
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select a = new Select(industry);
		a.selectByValue("IND_SOFTWARE");
		
		WebElement OwnerShip = driver.findElement(By.name("ownershipEnumId"));
		Select b = new Select(OwnerShip);
		b.selectByVisibleText("S-Corporation");
		

		WebElement Source = driver.findElement(By.name("dataSourceId"));
		Select bb = new Select(Source);
		bb.selectByValue("LEAD_EMPLOYEE");
		
		
		WebElement MarketingCampaign  = driver.findElement(By.name("marketingCampaignId"));
		Select dd = new Select(MarketingCampaign );
		dd.selectByIndex(5);
		
		WebElement StateProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select cc = new Select( StateProvince );
		cc.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
