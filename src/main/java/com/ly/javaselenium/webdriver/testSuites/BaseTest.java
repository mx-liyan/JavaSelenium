package com.ly.javaselenium.webdriver.testSuites;

import com.ly.javaselenium.webdriver.Listener.TestNGListener;
import com.ly.javaselenium.webdriver.contants.Config;
import io.qameta.allure.Story;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

/**
 * @author 李岩
 * @data 2021/10/20 17:51
 */
@Listeners({TestNGListener.class})
public class BaseTest {

    public WebDriver driver;

    @BeforeClass(description = "打开浏览器操作")
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass(description = "关闭浏览器操作")
    public void tearDown() {
        driver.quit();
    }
}
