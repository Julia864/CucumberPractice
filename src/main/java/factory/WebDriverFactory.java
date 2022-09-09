package factory;

import enumeration.SupportedBrowsers;
import org.openqa.selenium.WebDriver;
import properties.converters.SupportedBrowserConverter;
import properties.holder.PropertyHolder;

public class WebDriverFactory {
    public WebDriver getWebDriver() {
        String propertyValue = new PropertyHolder().readProperty("browser");
        SupportedBrowsers browser = SupportedBrowserConverter.valueOfWebBrowser(propertyValue);

        return browser.getWebDriver();
    }
}
