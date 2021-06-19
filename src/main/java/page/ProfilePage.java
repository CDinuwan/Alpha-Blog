package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    private By successFullyLoginAlert=By.id("flash_success");

    public String successFullyLoginText(){
        String alertText=$(successFullyLoginAlert).shouldBe(appear).getText();
        return alertText;
    }
}
