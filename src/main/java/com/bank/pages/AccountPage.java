package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By deposite = By.xpath("//button[normalize-space()='Deposit']");
    By ammount = By.xpath("//input[@placeholder='amount']");

    By submit = By.xpath("//button[@type='submit']");
    By verifyDeposite = By.xpath("//span[@class='error ng-binding']");
    By verifyWithdraw = By.xpath("//span[@class='error ng-binding']");
    By withdrawl = By.xpath("//button[normalize-space()='Withdrawl']");
    By withdraw = By.xpath("//button[normalize-space()='Withdraw']");

    public void clickOnDeposite(){
        clickOnElement(deposite);
    }
    public void enterAmount(){
        sendTextToElement(ammount,"100");
    }
    public void enterAmountWithdraw(){
        sendTextToElement(ammount,"50");
    }
    public void clickOnDepositeButton(){
        clickOnElement(submit);
    }
    public void getDepositeText(){
        assertVerifyText(verifyDeposite,"Deposit Successful","Text is not displayed");
    }
    public void getWithdrawText(){
        assertVerifyText(verifyWithdraw,"Transaction Successful","Text is not displayed");
    }
    public void clickOnWithdrawl(){
        clickOnElement(withdrawl);
    }
    public void clickOnWithdraw(){
        clickOnElement(withdraw);
    }
}
