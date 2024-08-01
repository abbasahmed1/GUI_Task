package Testing;

import Pages.AutomationPages;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import java.time.Duration;

public class SogetiAutomationTest extends BaseTest {

    @Test
    public void testAutomationPageNavigation() {
        driver.get("https://www.sogeti.com/");

        HomePage homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@class=\"sprite-header sprite-search-icon\"]")).click();
        homePage.hoverOverServices();
       // homePage.clickAutomationLink();

      //  AutomationPages automationPage = new AutomationPages(driver);
       // Assert.assertTrue("Automation page is not displayed.", automationPage.isAutomationPageDisplayed());
       // Assert.assertTrue("Automation text is not present.", automationPage.isAutomationTextPresent());
    }
}