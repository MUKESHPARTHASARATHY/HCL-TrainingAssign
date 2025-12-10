package seleniumassgn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink {
    public static void main(String[] args)  {

    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();

    	driver.get("https://www.flipkart.com/");

    	driver.findElement(By.partialLinkText("Sell")).click();

    	System.out.println("Clicked the Seller using partial Sell partial text");

    }
}
