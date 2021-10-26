package com.ly.javaselenium.webdriver.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author 李岩
 * @data 2021/10/20 11:07
 */
public class FirstPage {

    @FindBy(className = "logo")
    public WebElement logo;
}
