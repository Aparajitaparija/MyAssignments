package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
	   
	   org.openqa.selenium.Alert alert = driver.switchTo().alert();
	   alert.sendKeys("Hello");
	   System.out.println(alert.getText());
	   alert.accept();
	   
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("(//span[text()='Delete'])")).click();
	   driver.findElement(By.xpath("((//span[text()='No']))")).click();
	   
	  
		
		
		
		
		
		
		
		
		
	}

}
