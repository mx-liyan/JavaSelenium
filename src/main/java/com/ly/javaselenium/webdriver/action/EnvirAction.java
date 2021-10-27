package com.ly.javaselenium.webdriver.action;

import com.ly.javaselenium.webdriver.page.EnvirPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author 李岩
 * @data 2021/10/27 9:56
 */
public class EnvirAction extends BaseAction<EnvirPage>{


    public EnvirAction(WebDriver driver) {
        super(driver);
    }

    public void addClick(){
        t.addEnvir.click();
    }

    public void selectEnvir() throws InterruptedException {
        t.selectEnvir.sendKeys("天气");
        Thread.sleep(2000);
        t.buttonEnvir.click();
    }
}
