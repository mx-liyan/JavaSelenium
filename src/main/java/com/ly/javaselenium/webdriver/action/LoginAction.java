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
public class LoginAction {
    private LoginPage loginPage;
    private WebDriver driver;

    public LoginAction(WebDriver driver){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        this.driver = driver;
    }

    public void inUserPass(String user,String pass){
        loginPage.username.clear();
        loginPage.password.clear();
        loginPage.username.sendKeys(user);
        loginPage.password.sendKeys(pass);
        loginPage.dologin.click();
    }

    public String messRes(){
        driver.switchTo().defaultContent();
        MessPage messPage = PageFactory.initElements(driver, MessPage.class);
        return messPage.mess.getText();
    }
}
