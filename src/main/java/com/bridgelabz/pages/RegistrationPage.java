package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    WebDriver driver;

    @CacheLookup
    @FindBy(linkText = "Sign up")
    WebElement signUpLink;

    @CacheLookup
    @FindBy(name = "emailOrPhone")
    WebElement mobileNo;

    @CacheLookup
    @FindBy(name = "fullName")
    WebElement fullName;

    @CacheLookup
    @FindBy(name = "username")
    WebElement username;

    @CacheLookup
    @FindBy(name = "password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='mount_0_0_Y/']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[2]/form[1]/div[7]/div[1]")
    WebElement signUpButton;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public String redirectToSignUpPage () throws InterruptedException {
        Thread.sleep(1000);
        signUpLink.click();
        Thread.sleep(1000);
        String pageTitle = driver.getTitle();
        return pageTitle;

    }
    public boolean enterDataIntoTheFields() throws InterruptedException {
        signUpLink.click();
        mobileNo.sendKeys("9604411890");
        fullName.sendKeys("Namdev Chavan");
        username.sendKeys("namdevchavanmnb");
        password.sendKeys("namdev@1234");
        Thread.sleep(500);
        boolean flag = signUpButton.isEnabled();
        return flag;

    }

}

