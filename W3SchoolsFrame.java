package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3SchoolsFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		 // Switch the context from webpage to frame
//      WebElement frameElement = driver.findElement(By.className("demo-frame"));
      driver.switchTo().frame("iframeResult");
      
      driver.findElement(By.xpath("//button[text()='Try it']")).click();
      
      //driver.switchTo().defaultContent();
   // Switch the context from webpage to alert
      Alert alert = driver.switchTo().alert();
      alert.sendKeys("Poorna");
      alert.accept();
      
      
      String returnText=driver.findElement(By.xpath("//p[@id='demo']")).getText();
      if(returnText.contains("Poorna"))
      {
    	  System.out.println("return text contains Poorna");
    	  
      }
	}

}
