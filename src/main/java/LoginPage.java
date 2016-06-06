import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public PWPage enterLogin(String text) {
        driver.findElement(By.id("#Email")).sendKeys(text);
        driver.findElement(By.id("#next")).click();
        return new PWPage(driver);
    }

}
