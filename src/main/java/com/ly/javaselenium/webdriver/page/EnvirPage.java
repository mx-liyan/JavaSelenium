package com.ly.javaselenium.webdriver.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author 李岩
 * @data 2021/10/27 9:41
 */
public class EnvirPage {

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[1]/button[1]")
    public WebElement addEnvir;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[1]/div/div/input")
    public WebElement selectEnvir;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[1]/button[3]")
    public WebElement buttonEnvir;
}
