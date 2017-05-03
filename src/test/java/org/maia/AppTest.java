//package org.maia;


import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AppTest 
    extends TestCase
{

    @Test
   public void facebookScript(){



       System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("http://www.google.com");
       driver.manage().window().maximize();
       System.out.println(driver.getTitle());

       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
       driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("test");
       driver.findElement(By.xpath("//*[@id='u_0_3']")).sendKeys("selenium");
       driver.findElement(By.xpath(".//*[@id='u_0_h']")).click();
       Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
       sel1.selectByIndex(4);
       Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
       sel2.selectByIndex(2);
       Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
       sel3.selectByValue("1989");
       driver.findElement(By.xpath(".//*[@id='u_0_l']"));
       driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
       //driver.navigate().back();
       //driver.quit();
   }



}
