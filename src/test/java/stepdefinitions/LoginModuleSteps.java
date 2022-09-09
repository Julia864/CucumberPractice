package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageobject.pages.HomePage;
import pageobject.pages.LoginPage;

import static stepdefinitions.BaseSteps.PAGES_STORAGE;
import static stepdefinitions.BaseSteps.webDriver;

public class LoginModuleSteps {


    @Then("User stays on the login module at the {string}")
    public void userStaysOnTheLoginModuleAtThe(String url1) {
        String url11 = "https://github.com/session";
        Assert.assertEquals(url1, webDriver.getCurrentUrl(), "Urls are not the same");
    }
    

    @And("Error message {string} on {string} is displayed")
    public void errorMessageStringOnStringIsDisplayed(String a, String pageName) {
        String message = "Incorrect username or password.";
        HomePage homePage = (HomePage) PAGES_STORAGE.get(pageName);
        Assert.assertEquals(LoginPage.getErrorMessage(), message, "Messages are not the same");
    }

}
