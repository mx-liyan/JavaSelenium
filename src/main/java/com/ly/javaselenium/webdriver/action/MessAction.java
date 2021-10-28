package com.ly.javaselenium.webdriver.action;

import com.ly.javaselenium.webdriver.page.MessPage;
import org.openqa.selenium.WebDriver;

/**
 * @author 李岩
 * @data 2021/10/28 10:17
 */
public class MessAction extends BaseAction<MessPage>{
    public MessAction(WebDriver driver) {
        super(driver);
    }

    public String successText(){

        return t.successAlert.getText();
    }
}
