package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Main {
    @Test
    public void login ()
    {
        System.setProperty("webdriver.chrome.driver", "C://Users//Yuriy//IdeaProjects//test1//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    driver.get("https://mail.ukr.net/classic/login");
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys("Biziliavv");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("bizilia87");
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    driver.findElement(By.linkText("Выйти")).click();
        driver.close();
    }
    @Test
    public void wrong ()
    {
        System.setProperty("webdriver.chrome.driver", "C://Users//Yuriy//IdeaProjects//test1//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ukr.net/classic/login");
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("Biziliavv");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123456789");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

            assertEquals(driver.findElement(By.cssSelector("div.login__error.show")).getText(), "Логін або пароль вказано невірно. Докладніше");
        driver.close();


    }
}