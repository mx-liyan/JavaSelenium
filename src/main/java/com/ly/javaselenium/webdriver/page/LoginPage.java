package com.ly.javaselenium.webdriver.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author 李岩
 * @data 2021/10/19 9:50
 */
public class LoginPage{

    @FindBy(xpath = "/html/body/div[1]/form/div[1]/div/div/input")
    public WebElement username;

    @FindBy(xpath = "/html/body/div[1]/form/div[2]/div/div/input")
    public WebElement password;

    @FindBy(xpath = "/html/body/div[1]/form/div[3]/div/button")
    public WebElement dologin;

    //错误的提示
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/span")
    public WebElement failText;

    //错误提示的错误按钮
    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[2]")
    public WebElement failButton;


}
