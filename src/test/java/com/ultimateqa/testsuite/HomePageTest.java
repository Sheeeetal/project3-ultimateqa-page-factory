package com.ultimateqa.testsuite;

import com.ultimateqa.customlisteners.CustomListeners;
import com.ultimateqa.pages.HomePage;
import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
    @Test (groups = {"smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.navigatedToLoginPageWithClick();
    }

}
