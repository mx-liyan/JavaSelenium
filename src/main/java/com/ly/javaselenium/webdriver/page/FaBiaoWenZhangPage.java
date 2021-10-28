package com.ly.javaselenium.webdriver.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author 李岩
 * @data 2021/10/27 9:41
 */
public class FaBiaoWenZhangPage {

    //请选择文章
    @FindBy(xpath = "/html/body/div[1]/section/section/section/main/section/header/div[1]/div[1]/input")
    public WebElement selectInput;

    //人生感悟
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/ul/li[2]")
    public WebElement renShengGanWu;

    //标题input
    @FindBy(xpath = "/html/body/div[1]/section/section/section/main/section/header/div[2]/input")
    public WebElement titleInput;

    //编辑框
    @FindBy(xpath = "/html/body/div[1]/section/section/section/main/section/main/div[1]/div/div[2]/div[1]/div/div/textarea")
    public WebElement editInput;

    //发表文章
    @FindBy(xpath = "/html/body/div[1]/section/section/section/main/section/main/div[2]/button[2]")
    public WebElement sendWenZhang;
}
