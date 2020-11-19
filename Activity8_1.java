package Selenium_Session1;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Activity8_1 {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
         driver.get("https://training-support.net/selenium/dynamic-controls");
         String title = driver.getTitle();
		 System.out.println("Page title is: " + title);
		 WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		 WebElement togglecheckbox = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		 togglecheckbox.click();
		 
		 wait.until(ExpectedConditions.invisibilityOf(checkbox));
		 checkbox.click();
		 
		 driver.close();
		 
		 

	}

}
