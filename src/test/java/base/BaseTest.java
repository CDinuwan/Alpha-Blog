package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.HomePage;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    public HomePage homePage;

    @BeforeClass
    public void setUp(){
        open("https://selenium-blog.herokuapp.com/");

        homePage=new HomePage();
    }
    @AfterClass
    public void tearDown(){
        closeWebDriver();
    }
}
