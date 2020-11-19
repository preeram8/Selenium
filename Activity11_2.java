package Selenium_Session1;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;

public class Activity11_2 {
	 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();

    //Open browser
    driver.get("https://www.training-support.net/selenium/javascript-alerts");
    String title = driver.getTitle();
    System.out.println("The page titke is " + title);
    
    //Click the button to open a simple alert
    driver.findElement(By.cssSelector("button#confirm")).click();

    //Switch to alert window
    Alert confirmAlert = driver.switchTo().alert();
    System.out.println("Text on the alert is " + confirmAlert.getText());
    
    confirmAlert.accept();
    driver.close();
    
    

}
}
