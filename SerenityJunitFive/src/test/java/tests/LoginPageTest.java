package tests;


import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import steps.LoginPageSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginPageTest {

    @Steps
    LoginPageSteps loginPageSteps;

    @Managed
    WebDriver driver;

    @Test
    public void loginTest(){
        loginPageSteps.open();
        loginPageSteps.doLogin();
        loginPageSteps.verifyTitle();
    }
}

