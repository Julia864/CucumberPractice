package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobject.pages.HomePage;

import static stepdefinitions.BaseSteps.PAGES_STORAGE;
import static stepdefinitions.BaseSteps.webDriver;

public class HomePageSteps {

    @Then("User is successfully navigated to the {string}")
    public void userIsNavigatedToPage(String url) {
        Assert.assertEquals(url, webDriver.getCurrentUrl(), "Urls are not the same");

    }

    @And("User info {string} on {string} is present on navigation panel")
    public void userInfoOnIsPresentOnNavigationPanel(String username, String pageName) {
        HomePage homePage = (HomePage) PAGES_STORAGE.get(pageName);
        Assert.assertEquals(homePage.openProfileDropDown().getUserNameInfo(), username, "Usernames are not the same");
    }


}
