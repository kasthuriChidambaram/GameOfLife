package com.aconex.gol.userScenarios;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractScenario {
	private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }
    
    @Before
    public void setup() {
        this.driver = new FirefoxDriver();
        driver.get("file:///E:/gol/GameOfLife.html");
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.close();
    }
}
