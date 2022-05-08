package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		// Switch the context from webpage to alert
        Alert alert = driver.switchTo().alert();
        
        String text = alert.getText();
        System.out.println("Alert Text: "+ text);
        
        alert.accept();
        
        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
        
        Alert promptAlert = driver.switchTo().alert();
        
        String promptText = promptAlert.getText();
        System.out.println(promptText);
        
        promptAlert.sendKeys("Testleaf Chennai");
        
        
        promptAlert.accept();
        
        
	}

}
