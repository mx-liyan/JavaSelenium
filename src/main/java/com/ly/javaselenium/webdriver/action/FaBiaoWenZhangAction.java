package com.ly.javaselenium.webdriver.action;

import com.ly.javaselenium.webdriver.page.FaBiaoWenZhangPage;
import org.openqa.selenium.WebDriver;

/**
 * @author 李岩
 * @data 2021/10/27 9:56
 */
public class FaBiaoWenZhangAction extends BaseAction<FaBiaoWenZhangPage>{


    public FaBiaoWenZhangAction(WebDriver driver) {
        super(driver);
    }

    //发表文章
    public void FaBiaoWenZhang(String title,String text) throws InterruptedException {
        t.selectInput.click();
        t.renShengGanWu.click();
        t.titleInput.sendKeys(title);
        Thread.sleep(2000);
        t.editInput.sendKeys(text);
        t.sendWenZhang.click();
    }

}
