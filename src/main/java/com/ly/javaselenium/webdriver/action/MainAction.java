package com.ly.javaselenium.webdriver.action;

import com.ly.javaselenium.webdriver.page.MainPage;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

/**
 * @author 李岩
 * @data 2021/10/27 9:45
 */
public class MainAction extends BaseAction<MainPage>{


    public MainAction(WebDriver driver) {
        super(driver);
    }

    public void clickEnvirDiv(){
        //mainPage.zhankai.click();
        t.envirDiv.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String successText(){
        return t.successText.getText();
    }

    public void successButtonClick(){
        t.successButton.click();
    }

    //点击文章管理
    public void wenZhangManageClick(){
        t.wenZhangManage.click();
    }

    //点击发表文章
    public void faBiaoWenZhangClick(){
        t.faBiaoWenZhang.click();
    }
}
