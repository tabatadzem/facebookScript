//package org.maia;//package org.maia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Maia");
        driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("Tabatadze");
        driver.findElement(By.xpath(".//*[@id='u_0_6']")).sendKeys("test73998@gmail.com");
        driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("test73998@gmail.com");
        driver.findElement(By.xpath(".//*[@id='u_0_d']")).sendKeys("testtest1");
        Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
        sel2.selectByIndex(2);
        Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
        sel1.selectByIndex(4);
        Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
        sel3.selectByValue("1989");
        driver.findElement(By.xpath("//*[@id='u_0_h']")).click();
        driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();

//        driver.findElement(By.xpath(".//*[@id='u_0_l']"));
//        driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
//        driver.findElement(By.xpath("//*[@id='u_0_h']")).click();
        //driver.navigate().back();
        //driver.quit();


    }
}
