package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()= 'Try it']")).click();
		
		org.openqa.selenium.Alert a = driver.switchTo().alert();
		a.sendKeys("Aparajita");
		System.out.println(a.getText());
	    a.accept();
		
		
		
		
		
		

	}

}
