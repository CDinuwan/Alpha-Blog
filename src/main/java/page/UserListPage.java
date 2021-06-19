package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserListPage {

    private By successfullRegistrationAlert=By.id("flash_success");
    private By clickOnMenu=By.xpath(" /html[1]/body[1]/nav[1]/div[1]/div[1]/button[1]/span[3]");
    private By clickOnLogout=By.linkText("Logout");

    public String successfullRegistrationAlert(){
        String successfullRegAlert=$(successfullRegistrationAlert).shouldBe(Condition.appear).getText();
        return successfullRegAlert;
    }

    public HomePage clickOnLogout(){
        $(clickOnLogout).shouldBe(Condition.enabled).click();
        return new HomePage();
    }
}
