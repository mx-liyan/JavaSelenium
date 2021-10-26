package com.ly.javaselenium.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;

/**
 * @author 李岩
 * @data 2021/10/19 9:46
 */
public class BasePage {
    private WebDriver driver;
    private String url;

    public BasePage(WebDriver driver,String url){
        this.driver = driver;
        this.url = url;
    }

    public void openUrl(){
        driver.get(url);
    }

    public void quitUrl(){
        driver.quit();
    }
}
