package Selenium_Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity3 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		
        firstName.sendKeys("Preethy");
         lastName.sendKeys("R");
		
         driver.findElement(By.id("email")).sendKeys("pramados@in.ibm.com");
         driver.findElement(By.id("number")).sendKeys("1234567890");
         
         driver.findElement(By.cssSelector(".ui.green.button")).click();
         
         Thread.sleep(1000);
         
         driver.close();
	}

}
