package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomePage {

    private By loginLink=By.linkText("Log in");
    private By signUpLink=By.linkText("Sign up");

    public LoginPage clickLoginLink(){
        $(loginLink).shouldBe(enabled).click();
        return new LoginPage();
    }

    public SignUpPage clickSignUpLink(){
        $(signUpLink).shouldBe(enabled).click();
        return new SignUpPage();
    }
}
