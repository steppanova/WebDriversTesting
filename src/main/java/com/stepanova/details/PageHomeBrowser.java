package com.stepanova.details;

import org.openqa.selenium.WebDriver;

public class PageHomeBrowser {
    WebDriver driver;
    public SearchDetails search = new SearchDetails();
    public void initialized(){
        search.setBrowserName("http://www.google.com");
        driver.get(search.getBrowserName());
    }
    public PageHomeBrowser(WebDriver driver) {
        this.driver = driver;
    }
}
