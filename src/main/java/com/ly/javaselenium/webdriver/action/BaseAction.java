package com.ly.javaselenium.webdriver.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.ParameterizedType;

/**
 * @author 李岩
 * @data 2021/10/27 11:07
 */
public class BaseAction<T> {
    public WebDriver driver;
    public T t;

    public BaseAction(WebDriver driver){
        this.driver = driver;
        t = PageFactory.initElements(driver,getTClass());
    }

    public Class<T> getTClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
