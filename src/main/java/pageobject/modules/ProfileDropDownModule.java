package pageobject.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.BasePage;

import java.time.Duration;

public class ProfileDropDownModule extends BasePage {
    private WebElement userInfo;
    private WebElement errorMessage;

    public ProfileDropDownModule(WebDriver webDriver) {
        super(webDriver);
    }

    public String getUserNameInfo() {
        userInfo = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//strong[text()=\"Julia864\"]")));
        return userInfo.getText();
    }


}
