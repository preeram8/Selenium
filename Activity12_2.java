package Selenium_Session1;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity12_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		driver.switchTo().frame(0);
		//driver.switchTo().frame(0);
		WebElement frameHead1 = driver.findElement(By.className("content"));
		System.out.println(frameHead1.getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
        WebElement frameHead2 = driver.findElement(By.cssSelector("div.content"));
    	
        System.out.println(frameHead2.getText());
        
        driver.close();
	}

}
