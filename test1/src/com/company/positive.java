package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.*;

/**
 * Created by Yuriy on 24.07.2016.
 */
public class positive {
    String driver_path = "./lib//chromedriver.exe";
    @Test
    public void createfolder() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driver_path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ukr.net/classic/login");
        driver.findElement(id("login")).clear();
        driver.findElement(id("login")).sendKeys("Biziliavv");
        driver.findElement(id("password")).clear();
        driver.findElement(id("password")).sendKeys("bizilia87");
        driver.findElement(cssSelector("button[type=\"submit\"]")).click();
        driver.findElement(xpath("//body[@id='']")).click();
        driver.findElement(linkText("Управление папками")).click();
        Thread.sleep(1000);
        driver.findElement(id("new_folder_name")).sendKeys("folder");
        driver.findElement(id("create_new_folder")).click();
        Thread.sleep (1000);
        driver.findElement(linkText("Выйти")).click();
        driver.close();

    }
    @Test
    public void search () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driver_path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ukr.net/classic/login");
        driver.findElement(id("login")).clear();
        driver.findElement(id("login")).sendKeys("Biziliavv");
        driver.findElement(id("password")).clear();
        driver.findElement(id("password")).sendKeys("bizilia87");
        driver.findElement(cssSelector("button[type=\"submit\"]")).click();
        driver.findElement(cssSelector("span.title")).click();
        Thread.sleep (1000);
        driver.findElement(id("contacts-search-field")).sendKeys("focus5080@gmail.com");
        driver.findElement(cssSelector("#contacts-search > form > span.search-submit.button > input[name=\"find\"]")).click();
        Thread.sleep(1000);
        driver.findElement(cssSelector("a.button-r.view")).click();
        driver.findElement(name("note")).clear();
        driver.findElement(name("note")).sendKeys("test");
        driver.findElement(name("save")).click();
        driver.findElement(linkText("Выйти")).click();
        driver.close();
    }
    @Test
    public void sendmsgdraft () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driver_path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ukr.net/classic/login");
        driver.findElement(id("login")).clear();
        driver.findElement(id("login")).sendKeys("Biziliavv");
        driver.findElement(id("password")).clear();
        driver.findElement(id("password")).sendKeys("bizilia87");
        driver.findElement(cssSelector("button[type=\"submit\"]")).click();
        driver.findElement(new ByXPath(".//*[@id='500001']/a/span[3]")).click();
        Thread.sleep (2000);
        driver.findElement(new ByXPath(".//*[@id='msg14690416171300500181']/td[3]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(new ByXPath(".//*[@id='sendmsg-page']/div[3]/span[1]/input")).click();
        driver.close();
    }
}
