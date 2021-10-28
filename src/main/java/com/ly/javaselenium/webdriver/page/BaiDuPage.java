package com.ly.javaselenium.webdriver.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author 李岩
 * @data 2021/10/28 14:57
 */
public class BaiDuPage {

    @FindBy(id = "kw")
    public WebElement inputText;

    @FindBy(id = "su")
    public WebElement searchButton;
}
