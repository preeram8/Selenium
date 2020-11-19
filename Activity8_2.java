package Selenium_Session1;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class Activity8_2 {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
         driver.get("https://training-support.net/selenium/ajax");
         String title = driver.getTitle();
		 System.out.println("Page title is: " + title);

		 driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
	    	
	        
	    	
	        //getText() and print it
		
	        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
		
	        System.out.println("AjaxText is" + ajaxText);
		
	        
		
	        //Wait for late text
		
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		
	        
		
	        //Get late text and print it
		
	        String lateText = driver.findElement(By.id("ajax-content")).getText();
		
	        System.out.println("Late text is" + lateText);
		
	 
		
	        //Close browser
		
	        driver.close();
	}

}
