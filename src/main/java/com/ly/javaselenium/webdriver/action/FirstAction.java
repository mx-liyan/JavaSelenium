package com.ly.javaselenium.webdriver.action;

import com.ly.javaselenium.webdriver.page.FirstPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author 李岩
 * @data 2021/10/20 11:08
 */
public class FirstAction extends BaseAction<FirstPage>{


    public FirstAction(WebDriver driver) {
        super(driver);
    }

    public String shouRes(){
        return t.logo.getText();
    }
}
