package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {

    private By usernameField=By.cssSelector("#user_username");
    private By emailField=By.cssSelector("#user_email");
    private By passwordField=By.cssSelector("#user_password");
    private By loginBtn=By.name("commit");

    public void setUsernameField(String username){
        $(usernameField).shouldBe(Condition.enabled).setValue(username);
    }

    public void setEmailField(String email){
        $(emailField).shouldBe(Condition.enabled).setValue(email);
    }

    public void setPasswordField(String password){
        $(passwordField).shouldBe(Condition.enabled).setValue(password);
    }

    public UserListPage clickLoginBtn(){
        $(loginBtn).shouldBe(Condition.enabled).click();
        return new UserListPage();
    }
}
