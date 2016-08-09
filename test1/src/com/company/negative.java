package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.name;

/**
 * Created by Yuriy on 24.07.2016.
 */
public class negative {
    String driver_path = "./lib//chromedriver.exe";
    @Test
    protected void createc() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",driver_path );
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ukr.net/classic/login");
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("Biziliavv");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("bizilia87");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.findElement(By.cssSelector("span.title")).click();
        Thread.sleep(1000);
        driver.findElement (new By.ByXPath (".//*[@id='ab_sidebar']/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(name("email")).clear();
        driver.findElement(name("email")).sendKeys("focus5080@gmail.com");
        driver.findElement(name("note")).clear();
        driver.findElement(name("note")).sendKeys("test");
        driver.findElement(name("lname")).clear();
        driver.findElement(name("lname")).sendKeys("Lociko");
        driver.findElement(name("phone")).clear();
        driver.findElement(name("phone")).sendKeys("123456789");
        driver.findElement(name("company")).clear();
        driver.findElement(name("company")).sendKeys("gggg");
        Thread.sleep(1000);
        driver.findElement(name("save")).click();
    }
}
