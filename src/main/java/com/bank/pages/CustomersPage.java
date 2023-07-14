package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By customerButton = By.xpath("//button[normalize-space()='Customer Login']");
    By searchCustomer = By.xpath("//select[@id='userSelect']");

    public void clickOnCustomerButton(){
        clickOnElement(customerButton);
    }
    public void selectCustomerFromDropDown(){
        selectByVisibleTextFromDropDown(searchCustomer,"Harry Potter");
    }
}
