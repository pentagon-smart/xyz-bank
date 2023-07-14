package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customersPage = new CustomersPage();
    CustomerLoginPage customerLoginPage = new  CustomerLoginPage();
    AccountPage accountPage = new AccountPage();


    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        // click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManager();
        Thread.sleep(1000);

        //	click On "Add Customer" Tab
        addCustomerPage.clickOnAddCustomer();
        Thread.sleep(1000);

        //	enter FirstName
        addCustomerPage.enterFirstName();
        Thread.sleep(1000);

        //	enter LastName
        addCustomerPage.enterLastName();
        Thread.sleep(1000);

        //	enter PostCode
        addCustomerPage.enterPostCode();
        Thread.sleep(1000);

        //	click On "Add Customer" Button
        addCustomerPage.clickOnAddCustomerButton();

        //	popup display
        //	verify message "Customer added successfully"
        addCustomerPage.getPopupText();

        //	click on "ok" button on popup.
        addCustomerPage.clickOnPopUp();
    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        //click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManager();
        Thread.sleep(1000);

        //	click On "Open Account" Tab
        openAccountPage.clickOnOpenAccount();
        Thread.sleep(1000);

        //	Search customer that created in first test
        openAccountPage.selectCustomerName();
        Thread.sleep(1000);

        //	Select currency "Pound"
        openAccountPage.selectCurrency();
        Thread.sleep(1000);

        //	click on "process" button
        openAccountPage.clickOnProcess();
        Thread.sleep(1000);

        //	popup displayed
        //	verify message "Account created successfully"
        addCustomerPage.getPopupText();
        //	click on "ok" button on popup.
        addCustomerPage.clickOnPopUp();
    }

    @Test
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        customersPage.clickOnCustomerButton();
        Thread.sleep(1000);

        //	search customer that you created.
        customersPage.selectCustomerFromDropDown();
        Thread.sleep(1000);

        //	click on "Login" Button
        customerLoginPage.clickOnLogin();
        Thread.sleep(1000);

        //	verify "Logout" Tab displayed.
        customerLoginPage.getLogoutText();
        Thread.sleep(1000);

        //	click on "Logout"
        customerLoginPage.clickOnLogout();
        Thread.sleep(1000);

        //	verify "Your Name" text displayed.
        customerLoginPage.getYourNameText();

    }

    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        customersPage.clickOnCustomerButton();
        Thread.sleep(1000);

        //	search customer that you created.
        customersPage.selectCustomerFromDropDown();
        Thread.sleep(1000);

        //	click on "Login" Button
        customerLoginPage.clickOnLogin();
        Thread.sleep(1000);

        //	click on "Deposit" Tab
        accountPage.clickOnDeposite();
        Thread.sleep(1000);

        //	Enter amount 100
        accountPage.enterAmount();
        Thread.sleep(1000);

        //	click on "Deposit" Button
        accountPage.clickOnDepositeButton();
        Thread.sleep(1000);

        //	verify message "Deposit Successful"
        accountPage.getDepositeText();

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        customersPage.clickOnCustomerButton();
        Thread.sleep(1000);
        //	search customer that you created.
        customersPage.selectCustomerFromDropDown();
        Thread.sleep(1000);

        //	click on "Login" Button
        customerLoginPage.clickOnLogin();
        Thread.sleep(1000);

        //	click on "Withdrawl" Tab
        accountPage.clickOnWithdrawl();
        Thread.sleep(1000);

        //	Enter amount 50
        accountPage.enterAmountWithdraw();
        Thread.sleep(1000);

        //	click on "Withdrawl" Button
        accountPage.clickOnWithdraw();
        //	verify message "Transaction Successful"
//        accountPage.getWithdrawText();
    }
}
