package com.ly.javaselenium.webdriver.Listener;

import com.ly.javaselenium.webdriver.testSuites.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.ByteArrayInputStream;

public class TestNGListener extends TestListenerAdapter  {

    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        BaseTest bt = (BaseTest) tr.getInstance();
        WebDriver driver = bt.driver;
        takePhoto(driver);
    }

    @Attachment(value = "失败截图如下：",type = "image/png")
    public void takePhoto(WebDriver driver){
        byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("失败截图", new ByteArrayInputStream(screenshotAs));
    }

}
