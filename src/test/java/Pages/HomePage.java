package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;
    private By servicesMenu = By.xpath("//nav[@id='main-menu']//ul[@class='level0 clearfix']//li[@data-levelname='level2']//div[@class='wrapper']/span[text()='Services']");
    private By automationLink = By.linkText("Automation");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverServices() {
        WebElement servicesElement = driver.findElement(servicesMenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(servicesElement).perform();
    }

    public void clickAutomationLink() {
        driver.findElement(automationLink).click();
    }
}