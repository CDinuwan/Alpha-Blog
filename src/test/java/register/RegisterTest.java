package register;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SignUpPage;
import page.UserListPage;

public class RegisterTest extends BaseTest {

    @Test
    public void verifySignUp(){
        String username="BroHi111";

        SignUpPage signUpPage=homePage.clickSignUpLink();
        signUpPage.setUsernameField(username);
        signUpPage.setEmailField("broHi111@gmail.com");
        signUpPage.setPasswordField("BroHi1234111");
        UserListPage userListPage=signUpPage.clickLoginBtn();
        String alertText=userListPage.successfullRegistrationAlert();
        userListPage.clickOnLogout();
        Assert.assertEquals(alertText,"Welcome to the alpha blog "+username,"AlertText unmatched!");
    }
}
