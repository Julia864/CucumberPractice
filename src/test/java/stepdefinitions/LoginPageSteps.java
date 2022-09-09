package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobject.pages.HomePage;
import pageobject.pages.LoginPage;

import static stepdefinitions.BaseSteps.PAGES_STORAGE;
import static stepdefinitions.BaseSteps.webDriver;

public class LoginPageSteps {

    @Given("User is on {string}")
     public void userIsOnPage (String pageName) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.open();
        PAGES_STORAGE.put(pageName, loginPage);
    }

    @When("User enters unsername as {string} and password as {string} on {string}")
    public void userEntersUnsernameAsAndPasswordAsOn(String login, String password, String pageName) {
        LoginPage loginPage = (LoginPage) PAGES_STORAGE.get(pageName);
        HomePage homePage = loginPage.login(login, password);

        PAGES_STORAGE.put("Home Page", homePage);
    }


}
