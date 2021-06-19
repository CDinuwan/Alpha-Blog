package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage {

    private By emailField=By.cssSelector("#session_email");
    private By passwordField=By.cssSelector("#session_password");
    private By loginBtn=By.name("commit");

    public void enterEmail(String email){
        $(emailField).shouldBe(visible).setValue(email);
    }

    public void enterPassword(String password){
        $(passwordField).shouldBe(enabled).setValue(password);
    }

    public ProfilePage clickLoginBtn(){
        $(loginBtn).shouldBe(enabled).click();
        return new ProfilePage();
    }
}
