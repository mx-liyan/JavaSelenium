package com.ly.javaselenium.webdriver.testSuites;

import com.ly.javaselenium.webdriver.action.FirstAction;
import com.ly.javaselenium.webdriver.action.LoginAction;
import com.ly.javaselenium.webdriver.contants.Config;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author 李岩
 * @data 2021/10/19 10:14
 */
@Feature("登录测试")
public class LoginTest extends BaseTest{

    LoginAction loginAction;

    /**
     * 1代表正确，0代表不正确
     */

    @Test(priority = 2)
    @Story("输入操作")
    @Description("输入正确的用户名、密码")
    public void user1pass1() throws InterruptedException {
        Allure.step("输入用户名、密码");
        loginAction = new LoginAction(driver);
        loginAction.inUserPass(Config.userName,Config.passWord);
        Thread.sleep(5000);
        FirstAction firstAction = new FirstAction(driver);
        Assert.assertEquals(firstAction.shouRes(),"MX自动化测试管理平台");
        //Thread.sleep(3000);
    }

    /**
     * 1代表正确，0代表不正确
     */

    @Test(priority = 1)
    @Story("输入操作")
    @Description("输入正确的用户名、错误的密码")
    public void user1pass0() throws InterruptedException {
        Allure.step("输入用户名、错误的密码");
        loginAction = new LoginAction(driver);
        loginAction.inUserPass(Config.userName1,Config.passWord0);
        Assert.assertEquals(loginAction.messRes(),"密码错误111");

        //Thread.sleep(3000);
    }

}
