package com.ly.javaselenium.webdriver.testSuites;

import com.ly.javaselenium.common.util.ExcelData;
import com.ly.javaselenium.webdriver.action.LoginAction;
import com.ly.javaselenium.webdriver.action.MainAction;
import com.ly.javaselenium.webdriver.contants.Config;
import io.qameta.allure.*;
import jxl.read.biff.BiffException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author 李岩
 * @data 2021/10/19 10:14
 * @BeforeSuite 整个测试套件前执行，最外侧的
 * @BeforeTest 在testng.xml中的每一个test标签执行前运行
 * @BeforeGroups 被注解的方法，将在指定组内任意用例执行之前执行
 * @BeforeClass 是测试类执行之前执行的
 * @BeforeMethod 是在每个测试方法之前执行的
 */
@Feature("登录测试")
public class LoginTest extends BaseTest {

    LoginAction loginAction;

    @BeforeClass(description = "输入网址")
    public void setTest() {
        driver.get(Config.url);
        loginAction = new LoginAction(driver);
    }

    /**
     * 1代表正确，0代表不正确
     */

    @Test(priority = 2, description = "输入正确的用户名、密码")
    @Story("输入操作")
    @Description("输入正确的用户名、密码")
    @Parameters({"userName", "passWord"})
    public void user1pass1(String user, String pass) throws InterruptedException {
        Allure.step("输入用户名、密码");
        loginAction.inUserPass(user, pass);
        Thread.sleep(5000);
        MainAction mainAction = new MainAction(driver);
        Assert.assertEquals(mainAction.successText(), "友情提示");
        mainAction.successButtonClick();
        //Thread.sleep(3000);
    }


    @DataProvider(name = "num")
    public Object[][] Numbers() throws BiffException, IOException {
        ExcelData e = new ExcelData("aa", "Sheet1");
        return e.getExcelData();
    }

    /**
     * 1代表正确，0代表不正确
     */

    @Test(priority = 1, description = "输入正确的用户名、错误的密码", dataProvider = "num")
    @Story("输入操作")
    @Description("输入正确的用户名、错误的密码")
    public void user1pass0(HashMap<String, String> data) throws InterruptedException {
        Allure.step("输入用户名、错误的密码");
        loginAction.inUserPass(data.get("username"), data.get("password"));
        Thread.sleep(2000);
        Assert.assertEquals(loginAction.failText(), "失败!");
        loginAction.failButtonClick();
        Thread.sleep(5000);
        //Thread.sleep(3000);
    }

}
