package com.bridgelabz.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
    public static WebDriver driver;
    public static Logger log=Logger.getLogger(BaseClass.class.getName());

    public void setup() {

        PropertyConfigurator.configure("src/main/resources/application.properties");
        BasicConfigurator.configure();

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);

        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        log.info("Instagram has been launch with the help of chrome browser");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void closeWindow() {
        driver.quit();
        log.info("Quit");
    }


    public static void screenshot(String methodName) throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("/C:\\Users\\namde\\eclipse-workspace\\Instagram_Automation\\src\\main\\resources\\application.properties/Screenshots"+methodName+".png");
        FileUtils.copyFile(srcFile, destinationFile);
    }
}

