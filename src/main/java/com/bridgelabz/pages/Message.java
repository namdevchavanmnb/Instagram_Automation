package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Message {
    WebDriver driver;

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/main[1]/div[1]")
    WebElement message;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div/section/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea")
    WebElement msgPlace;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/button[2]")
    WebElement notNow;

    public Message(WebDriver driver ) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void messageToSearchPeople() throws InterruptedException{
        DashBoard dash =new DashBoard(driver);
        dash.loginToDashBoard();
        message.click();
        Thread.sleep(1000);
        notNow.clear();
        Thread.sleep(500);
        msgPlace.sendKeys("hello sir!! i am Namdev Chavan");
        Thread.sleep(1000);
    }
}

