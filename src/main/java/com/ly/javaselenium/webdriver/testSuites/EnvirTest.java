package com.ly.javaselenium.webdriver.testSuites;

import com.ly.javaselenium.webdriver.action.EnvirAction;
import com.ly.javaselenium.webdriver.action.LoginAction;
import com.ly.javaselenium.webdriver.action.MainAction;
import com.ly.javaselenium.webdriver.contants.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author 李岩
 * @data 2021/10/27 9:41
 */
@Feature("测试环境模块测试")
public class EnvirTest extends BaseTest{

    private static EnvirAction envirAction;
    private MainAction mainAction;
    LoginAction loginAction;
    @BeforeClass(description = "输入网址、登录")
    public void setTest(){
        driver.get(Config.url);
        loginAction = new LoginAction(driver);
        loginAction.inUserPass(Config.userName, Config.passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainAction = new MainAction(driver);
        mainAction.clickEnvirDiv();
        envirAction = new EnvirAction(driver);
    }

    @Test(description = "输入正确不重复的环境名称")
    @Story("新增测试环境")
    @Description("输入正确不重复的环境名称")
    public static void addEnvir() throws InterruptedException {
        envirAction.addClick();
        Thread.sleep(5000);
    }

    @Test(description = "查询测试环境")
    @Story("查询测试环境")
    @Description("查询测试环境")
    public static void seleteEnvir() throws InterruptedException {
        envirAction.selectEnvir();
        Thread.sleep(5000);
    }

}
