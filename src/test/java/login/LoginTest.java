package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import page.ProfilePage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin(){
        LoginPage loginPage=homePage.clickLoginLink();
        loginPage.enterEmail("cdinuwan@gmail.com");
        loginPage.enterPassword("chanu");
        ProfilePage profilePage=loginPage.clickLoginBtn();
        String alertText=profilePage.successFullyLoginText();
        Assert.assertEquals(alertText,"You have successfully logged in!","Your login alertText is incorrect");
    }
}
