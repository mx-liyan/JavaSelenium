package com.ly.javaselenium.webdriver.testSuites;

import com.ly.javaselenium.webdriver.action.FaBiaoWenZhangAction;
import com.ly.javaselenium.webdriver.action.LoginAction;
import com.ly.javaselenium.webdriver.action.MainAction;
import com.ly.javaselenium.webdriver.action.MessAction;
import com.ly.javaselenium.webdriver.contants.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author 李岩
 * @data 2021/10/27 9:41
 */
@Feature("发表文章模块测试")
public class FaBiaoWenZhang extends BaseTest{

    private static FaBiaoWenZhangAction faBiaoWenZhangAction;
    private MainAction mainAction;
    LoginAction loginAction;
    @BeforeClass(description = "输入网址、登录")
    public void setTest(){
        driver.get(Config.url);
        loginAction = new LoginAction(driver);
        loginAction.inUserPass(Config.userName, Config.passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainAction = new MainAction(driver);
        mainAction.successButtonClick();
        mainAction.wenZhangManageClick();
        mainAction.faBiaoWenZhangClick();
        faBiaoWenZhangAction = new FaBiaoWenZhangAction(driver);
    }

    @Test(description = "输入正确的文章发表")
    @Story("新增文章")
    @Description("输入正确的文章发表")
    public void addWenZhang() throws InterruptedException {
        faBiaoWenZhangAction.FaBiaoWenZhang(Config.FaBiaoWenZhangTitle,Config.FaBiaoWenZhangText);
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/section/section/section/main/div/span[2]")).getText(),"文章列表");
    }


}
