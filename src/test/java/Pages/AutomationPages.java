package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPages {
    private WebDriver driver;
    private By pageTitle = By.tagName("h1");

    public AutomationPages(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAutomationPageDisplayed() {
        return driver.findElement(pageTitle).isDisplayed();
    }

    public boolean isAutomationTextPresent() {
        return driver.findElement(pageTitle).getText().contains("Automation");
    }
}