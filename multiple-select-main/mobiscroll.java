package multidropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class mobiscroll {

    @Test
    public void MultipleDropTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select");

        driver.findElement(By.cssSelector("#multiple-select-context > label > span.mbsc-ios.mbsc-ltr.mbsc-textfield-inner.mbsc-textfield-inner-outline.mbsc-textfield-inner-stacked.mbsc-textarea-inner.mbsc-textfield-tags-inner > span.mbsc-textfield-tags.mbsc-ios.mbsc-ltr.mbsc-textfield.mbsc-textfield-outline.mbsc-select.mbsc-textfield-stacked.mbsc-textfield-outline-stacked.mbsc-textarea > span")).click();
        driver.findElement(By.xpath("//div[@role='option' and text()='Books']/span")).click();
        driver.findElement(By.xpath("//div[@role='option' and text()='Movies, Music & Games']/span")).click();
        driver.findElement(By.xpath("//div[@role='option' and text()='Electronics & Computers']/span")).click();
        driver.findElement(By.xpath("//div[@role='option' and text()='Toys, Kids & Baby']/span")).click();
        
        
    }
}