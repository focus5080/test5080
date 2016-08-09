package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Yuriy on 21.07.2016.
 */
public class Main1 {
    @Test
    public void sendmsg ()
    {
        System.setProperty("webdriver.chrome.driver", "C://Users//Yuriy//IdeaProjects//test1//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ukr.net/classic/login");
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("Biziliavv");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("bizilia87");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.findElement(By.linkText("Написать письмо")).click();
        driver.findElement(By.id("toField")).clear();
        driver.findElement(By.id("toField")).sendKeys("focus5080@gmail.com,");
        driver.findElement(By.name("subject")).clear();
        driver.findElement(By.name("subject")).sendKeys("test");
        driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
        driver.close();

    }

}
