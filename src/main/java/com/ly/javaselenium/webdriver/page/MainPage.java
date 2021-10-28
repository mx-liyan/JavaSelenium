package com.ly.javaselenium.webdriver.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author 李岩
 * @data 2021/10/27 9:43
 */
public class MainPage {

    //登录成功提示
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/span")
    public WebElement successText;

    @FindBy(className = "collapse-btn")
    public WebElement zhankai;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/ul/li[3]")
    public WebElement envirDiv;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[2]")
    public WebElement successButton;

    //文章管理
    @FindBy(xpath = "/html/body/div[1]/section/section/aside/ul/li[1]/div")
    public WebElement wenZhangManage;

    //发表文章
    @FindBy(xpath = "/html/body/div[1]/section/section/aside/ul/li[1]/ul/li[2]")
    public WebElement faBiaoWenZhang;

}
