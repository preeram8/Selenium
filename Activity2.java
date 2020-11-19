package Selenium_Session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("Text in element: " + idLocator.getText());
		
		WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
    	System.out.println("Text in element: " + linkTextLocator.getText());
	
	
        driver.close();
	}

}
