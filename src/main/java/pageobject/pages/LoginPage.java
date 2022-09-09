package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.BasePage;

import java.time.Duration;

public class LoginPage extends BasePage {
    @FindBy(id = "login_field")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(name = "commit")
    private static WebElement sighInButton;


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage open() {
        webDriver.get("https://www.github.com/login");
        return this;
    }

    public HomePage login(String username, String pass) {
        loginField.sendKeys(username);
        passwordField.sendKeys(pass);
        sighInButton.click();

        return new HomePage(webDriver);
    }

    public void fillIncorrectData(String username, String pass) {
        loginField.sendKeys(username);
        passwordField.sendKeys(pass);
    }

    public static String getErrorMessage() {
        sighInButton.click();
        return webDriver.findElement(By.xpath("//*[text()[contains(.,'Incorrect username or password')]]")).getText();
    }

    public static String getButton() {
        sighInButton.click();
        return webDriver.findElement(By.xpath("//*[contains(@class, 'btn btn-sm btn-primary')]")).getText();
    }

}
