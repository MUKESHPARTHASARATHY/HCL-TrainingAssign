package locandbrocomm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {
	public static void main(String[] args) throws InterruptedException  {

    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();

    	driver.get("https://simatstransport.saveetha.com/");
    	driver.findElement(By.cssSelector("#registerNumber")).sendKeys("212223230243");
    	driver.findElement(By.cssSelector("#pass")).sendKeys("welcome");
    	Thread.sleep(5000); 
    	driver.findElement(By.cssSelector(".submit-button.mb-3")).click();
    	System.out.println("login success");
	}


}
