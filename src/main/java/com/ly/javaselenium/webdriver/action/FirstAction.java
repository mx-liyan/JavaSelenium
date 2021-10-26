package com.ly.javaselenium.webdriver.action;

import com.ly.javaselenium.webdriver.page.FirstPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author 李岩
 * @data 2021/10/20 11:08
 */
public class FirstAction {

    private FirstPage firstPage;

    public FirstAction(WebDriver driver){
        firstPage = PageFactory.initElements(driver,FirstPage.class);
    }

    public String shouRes(){
        return firstPage.logo.getText();
    }
}
