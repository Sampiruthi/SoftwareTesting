package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.demoblaze.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement element=driver.findElement(By.linkText("Laptops"));
        element.click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("MacBook air")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Add")).click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.linkText("Cart")).click();
        String title=driver.findElement(By.xpath("//*[@id='tbodyid']/tr/td[2]")).getText();
        String price=driver.findElement(By.xpath("//*[@id='tbodyid']/tr/td[3]")).getText();
        System.out.println("Product Name: "+title+"  Price: "+price);
        //System.out.println( "Hello World!" );
    }
}
