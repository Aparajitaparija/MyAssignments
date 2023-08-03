package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAlert {

	public static void main(String[] args) throws InterruptedException {
	
		 ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.leafground.com/alert.xhtml");
			driver.manage().window().maximize();
//alrt1	
			
			
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
        alert.accept();

//alert2			
        
    
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
 
	Thread.sleep(2000);

//alert3			
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	    driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	
//alert4
	    
	 Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
	  driver.findElement(By.xpath("(//a[@href=\"#\"])[14]")).click();
	  
	 
//alert5
	  driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();	
	  org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
	  alert2.sendKeys("aparajita");
	  alert2.accept();
	  

//alert6	  
	  driver.findElement(By.xpath("//span[text()='Delete']")).click();
	  driver.findElement(By.xpath("//span[text()='No']")).click();
	  
//alert7	  
	  driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();  
	  driver.findElement(By.xpath("(//a[@href=\"#\"])[15]")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	}

}
