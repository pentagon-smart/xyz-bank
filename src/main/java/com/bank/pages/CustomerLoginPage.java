package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By login = By.xpath("//button[contains(text(),'Login')]");

    By logOut = By.xpath("//button[contains(text(),'Logout')]");
    By verifyYourName = By.xpath("//label[contains(text(),'Your Name :')]");

    public void clickOnLogin(){
        clickOnElement(login);
    }
    public void getLogoutText(){
        assertVerifyText(logOut,"Logout","Logout is not displayed");
    }
    public void clickOnLogout(){
        clickOnElement(logOut);
    }
    public void getYourNameText(){
        assertVerifyText(verifyYourName,"Your Name :","Your name is not displayed");
    }
}
