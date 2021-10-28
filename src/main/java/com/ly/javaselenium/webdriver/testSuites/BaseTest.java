package com.ly.javaselenium.webdriver.testSuites;

import com.ly.javaselenium.webdriver.Listener.TestNGListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

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
