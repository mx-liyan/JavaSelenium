package com.ly.javaselenium.webdriver.action;

import com.ly.javaselenium.webdriver.page.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * @author 李岩
 * @data 2021/10/19 10:07
 */
public class LoginAction extends BaseAction<LoginPage>{


    public LoginAction(WebDriver driver) {
        super(driver);
    }

    public void inUserPass(String user, String pass) throws InterruptedException {
        t.username.click();
        t.username.sendKeys(Keys.CONTROL, "a");
        t.username.sendKeys(Keys.chord(Keys.DELETE));
        t.password.click();
        t.password.sendKeys(Keys.CONTROL, "a");
        t.password.sendKeys(Keys.chord(Keys.DELETE));

        t.username.sendKeys(user);
        Thread.sleep(2000);
        t.password.sendKeys(pass);
        Thread.sleep(2000);
        t.dologin.click();
    }

    public String failText(){
        /*driver.switchTo().defaultContent();
        MessPage messPage = PageFactory.initElements(driver, MessPage.class);
        return messPage.mess.getText();*/
        return t.failText.getText();
    }

    public void failButtonClick(){
        t.failButton.click();
    }
}
