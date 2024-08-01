package Testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WebDriverManage;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManage.getDriver();
    }

    @AfterClass
    public void tearDown() {
        // WebDriverManage.quitDriver();
    }
}