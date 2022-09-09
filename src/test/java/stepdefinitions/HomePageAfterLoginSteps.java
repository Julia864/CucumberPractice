package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageobject.pages.HomePage;
import pageobject.pages.LoginPage;

import static stepdefinitions.BaseSteps.PAGES_STORAGE;
import static stepdefinitions.BaseSteps.webDriver;

public class HomePageAfterLoginSteps {

    @Then("User is successfully navigated to the {string}")
    public void userIsNavigatedToPage(String url) {
        Assert.assertEquals(url, webDriver.getCurrentUrl(), "Urls are not the same");

    }

    @And("Button {string} on {string} is displayed")
    public void buttonNewIsDisplayed(String buttonNew1, String pageName) {
        String buttonNew = "New";
        HomePage homePage = (HomePage) PAGES_STORAGE.get(pageName);
        Assert.assertEquals(LoginPage.getButton(), buttonNew, "Buttons are not the same");
    }

}
