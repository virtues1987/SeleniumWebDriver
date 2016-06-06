import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGMail {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://gmail.com");
        driver.get(driver.getCurrentUrl());
    }

    @Test
    private void testSignIn() {
        LoginPage login = new LoginPage(driver);
        PWPage password = login.enterLogin("horuk.at15");
        Assert.assertTrue(password.getUserName().contains("AT15"));
        GMailPage mail = password.enterPW("horuk.at15horuk.at15");
        Assert.assertTrue(mail.getEMailFromList().contains("Selenium"));
    }

    @AfterTest
    private void tearDown() {
        driver.close();
    }
}
