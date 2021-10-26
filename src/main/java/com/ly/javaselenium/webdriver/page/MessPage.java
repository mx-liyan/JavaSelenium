package com.ly.javaselenium.webdriver.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author 李岩
 * @data 2021/10/20 17:13
 */
public class MessPage {

    @FindBy(xpath = "/html/body/div[2]/p")
    public WebElement mess;

}
