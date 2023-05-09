package com.bridgelabz.pages;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard extends BaseClass {
    WebDriver driver;

    @FindBy(name = "username")
    WebElement userName;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]")
    WebElement loginButton;

    @FindBy(xpath= "//body/div[@id='mount_0_0_sN']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/main[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[3]/div[1]/div[1]/section[1]/span[1]/button[1]/div[2]/span[1]/*[1]")
    WebElement searchFeature;

    @FindBy(xpath = "//body/div[@id='mount_0_0_xv']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/div[1]")
    WebElement searchBar;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")
    WebElement SearchPPL;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/main[1]/div[1]")
    WebElement follow;


    public DashBoard(WebDriver driver ) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void loginToDashBoard() throws InterruptedException{
        userName.click();
        userName.sendKeys("namdevchavanmnb");
        password.sendKeys("namdev@1234");
        loginButton.click();
        searchFeature.click();
        searchBar.sendKeys("namdev");
        SearchPPL.click();
        follow.click();
        Thread.sleep(1000);

    }



}
