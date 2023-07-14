package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By openAccount = By.xpath("//button[normalize-space()='Open Account']");

    By customer = By.xpath("//select[@id='userSelect']");
    By pound = By.xpath("//select[@id='currency']");

    By process = By.xpath("//button[contains(text(),'Process')]");
    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }

    public void selectCustomerName(){
        selectByVisibleTextFromDropDown(customer,"Hermoine Granger");
    }
    public void selectCurrency(){
        selectByVisibleTextFromDropDown(pound,"Pound");
    }
    public void clickOnProcess(){
        clickOnElement(process);
    }

}
