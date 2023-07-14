package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddCustomerPage extends Utility {

    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By fName = By.xpath("//input[@placeholder='First Name']");
    By lName = By.xpath("//input[@placeholder='Last Name']");
    By postcode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@type='submit']");


    public void clickOnAddCustomer(){
        clickOnElement(addCustomer);
    }
    public void enterFirstName(){
        sendTextToElement(fName,"Poonam");
    }
    public void enterLastName(){
        sendTextToElement(lName,"Ramaavt");
    }
    public void enterPostCode(){
        sendTextToElement(postcode,"123456");
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }

    public void getPopupText(){
       String actualText = getTextFromAlert();
       String expectedText = getTextFromAlert();
        Assert.assertEquals(actualText,expectedText,"text is not displayed");
    }

    public void clickOnPopUp(){
        switchToAlert();
    }
}
