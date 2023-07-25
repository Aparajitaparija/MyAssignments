package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aparajita");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Parija");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select element = new Select(source);
        element.selectByVisibleText("Employee");
        
        WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select element1 = new Select(marketingCampaign);
        element1.selectByValue("9001");
        
        WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select own = new Select(ownership);
        own.selectByIndex(4);
        
        
        WebElement country = driver.findElement(By.name("generalCountryGeoId"));
        Select c = new Select(country);
        c.selectByVisibleText("India");
        
        driver.findElement(By.name("submitButton")).click();
        
        String a = driver.getTitle();
        System.out.println(a);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
