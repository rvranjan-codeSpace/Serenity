package steps;

import UI.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginPageSteps {

    private LoginPage loginPage;

   @Step
    public void open(){
        loginPage.open();
   }

    @Step
    public void doLogin(){
        loginPage.login();
    }

    @Step
    public void verifyTitle(){
        String title = loginPage.getTitleOfPage();
        System.out.println("Title ="+title);
    }
}
