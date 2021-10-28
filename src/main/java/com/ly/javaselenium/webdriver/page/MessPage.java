package com.ly.javaselenium.webdriver.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author 李岩
 * @data 2021/10/28 10:17
 */
public class MessPage {

    //弹出成功框
    @FindBy(xpath = "/html/body/div[3]/p")
    public WebElement successAlert;
}
