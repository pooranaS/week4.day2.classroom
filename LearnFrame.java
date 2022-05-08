package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		 // Switch the context from webpage to frame
//      WebElement frameElement = driver.findElement(By.className("demo-frame"));
      driver.switchTo().frame(5);
      
      driver.findElement(By.xpath("//li[text()='Item 1']")).click();
      
      driver.switchTo().defaultContent();
      
      driver.findElement(By.linkText("Download")).click();
      
	}

}
