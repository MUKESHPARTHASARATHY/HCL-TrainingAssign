package multidropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();	
        Thread.sleep(2000);
        driver.navigate().to("https://www.instagram.com/");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
	}

}
