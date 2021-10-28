package com.ly.javaselenium.webdriver.action;

import com.ly.javaselenium.webdriver.page.BaiDuPage;
import org.openqa.selenium.WebDriver;

/**
 * @author 李岩
 * @data 2021/10/28 14:58
 */
public class BaiDuAction extends BaseAction<BaiDuPage>{
    public BaiDuAction(WebDriver driver) {
        super(driver);
    }

    public void Search(String text){
        t.inputText.sendKeys(text);
        t.searchButton.click();
    }
}
