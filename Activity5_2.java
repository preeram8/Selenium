package Selenium_Session1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Activity5_2 {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
	     driver.get("https://www.training-support.net/selenium/dynamic-controls");
	     String title = driver.getTitle();
		 System.out.println("Page title is: " + title);
		 WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 System.out.println("The Checkbox is selected" +checkboxInput.isSelected());
		 
		 checkboxInput.click();
		 System.out.println("The Checkbox is selected" +checkboxInput.isSelected());
		 driver.close();
		 
	}

}
