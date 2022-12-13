package com.ultimateqa.pages;

import com.aventstack.extentreports.Status;
import com.ultimateqa.customlisteners.CustomListeners;
import com.ultimateqa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
  @CacheLookup
    @FindBy (xpath = "//li[@class='header__nav-item header__nav-sign-in']/a[1]")
    WebElement navigateToSignInButton;
@CacheLookup
    @FindBy (xpath = "//h2[contains(text(),'Welcome Back!')]")
    WebElement welcomeBackMessage;
@CacheLookup
    @FindBy (id = "user[email]")
    WebElement invalidUsername;
@CacheLookup
    @FindBy (id = "user[password]")
    WebElement passcode;
@CacheLookup
    @FindBy (xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInButton;
@CacheLookup
    @FindBy (xpath = "//li[contains(text(),'Invalid email or password.')]")
    WebElement errorMessage;

    public void navigatedToLoginPage(){
        CustomListeners.test.log(Status.PASS,"Enter navigatedToLoginPage " + navigateToSignInButton );
        clickOnElement(navigateToSignInButton);
    }

    public String Message(){
        CustomListeners.test.log(Status.PASS,"Enter Message " + welcomeBackMessage );
        return getTextFromElement(welcomeBackMessage);
    }
    public void userName(String email) {
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + invalidUsername );

        sendTextToElement(invalidUsername,email);
    }
    public void passwordField(String password){
        CustomListeners.test.log(Status.PASS,"Enter passwordField " + passcode );

        sendTextToElement(passcode,password);
    }
    public String messageOccur(){
        CustomListeners.test.log(Status.PASS,"Enter  messageOccur" + errorMessage );
        return getTextFromElement(errorMessage);
    }
    public void setSignInButton(){
        CustomListeners.test.log(Status.PASS,"Enter  setSignInButton"+ signInButton );
        clickOnElement(signInButton);
    }
}


