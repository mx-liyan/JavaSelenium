package com.ly.javaselenium.webdriver.testSuites;

import com.ly.javaselenium.webdriver.action.BaiDuAction;
import com.ly.javaselenium.webdriver.contants.Config;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author 李岩
 * @data 2021/10/28 15:00
 */
@Feature("百度测试页面")
public class BaiDuTest extends BaseTest{

    private BaiDuAction baiDuAction;

    @BeforeClass(description = "打开url")
    public void setText(){
        driver.get(Config.BaiDu);
        baiDuAction = new BaiDuAction(driver);
    }

    @Test(description = "搜索selenium")
    @Story("测试滚动")
    public void baidu() throws InterruptedException {
        baiDuAction.Search(Config.searchText);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*for (int i = 0; i < 10; i++) {
            System.out.println("sleep 1s");
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+(i * 500)+")");
        }*/
        String script = "return arguments[0].scrollIntoView();";
        WebElement element = driver.findElement(By.id("help"));
        ((JavascriptExecutor) driver).executeScript(script, element);
        Thread.sleep(2000);
    }
}
