package com.ultimateqa.pages;

import com.aventstack.extentreports.Status;
import com.ultimateqa.customlisteners.CustomListeners;
import com.ultimateqa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @FindBy(xpath = "//li[@class='header__nav-item header__nav-sign-in']/a[1]")
    WebElement navigateToLoginPage;

    public void navigatedToLoginPageWithClick(){
        CustomListeners.test.log(Status.PASS,"Enter navigatedToLoginPageWithClick " + navigateToLoginPage);
        clickOnElement(navigateToLoginPage);

}}
