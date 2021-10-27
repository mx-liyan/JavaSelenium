package com.ly.javaselenium.webdriver.action;

import com.ly.javaselenium.webdriver.page.LoginPage;
import com.ly.javaselenium.webdriver.page.MessPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @author 李岩
 * @data 2021/10/19 10:07
 */
public class LoginAction extends BaseAction<LoginPage>{


    public LoginAction(WebDriver driver) {
        super(driver);
    }

    public void inUserPass(String user, String pass){
        t.username.clear();
        t.password.clear();
        t.username.sendKeys(user);
        t.password.sendKeys(pass);
        t.dologin.click();
    }

    public String messRes(){
        driver.switchTo().defaultContent();
        MessPage messPage = PageFactory.initElements(driver, MessPage.class);
        return messPage.mess.getText();
    }
}
