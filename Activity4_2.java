package Selenium_Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity4_2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		firstname.sendKeys("Preethy");
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		lastname.sendKeys("R");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("pramados@in.ibm.com");
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"number\"]"));
		contact.sendKeys("1234567890");
		driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		
}

}