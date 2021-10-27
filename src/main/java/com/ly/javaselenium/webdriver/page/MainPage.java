package com.ly.javaselenium.webdriver.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author 李岩
 * @data 2021/10/27 9:43
 */
public class MainPage {

    @FindBy(className = "collapse-btn")
    public WebElement zhankai;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/ul/li[3]")
    public WebElement envirDiv;
}
