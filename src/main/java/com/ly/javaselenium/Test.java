package com.ly.javaselenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author 李岩
 * @data 2021/10/19 9:31
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com/");
        webDriver.findElement(By.id("kw")).sendKeys("足球");
        webDriver.findElement(By.id("su")).click();
        Thread.sleep(2000);
        Assert.assertEquals(webDriver.getTitle(),"足球_百度搜索");
    }
}
