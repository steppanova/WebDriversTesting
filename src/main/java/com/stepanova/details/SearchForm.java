package com.stepanova.details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchForm {
    WebDriver driver;
    By name = By.name("q");
    String wordSearch = "java";
    String findWord = "title";
    public SearchForm(WebDriver driver) {
        this.driver = driver;
    }
    public void setName (){
        driver.findElement(name).sendKeys(wordSearch);
    }
    public String findResult() {
        return driver.switchTo().activeElement().getAttribute(findWord);
    }
}
