import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PWPage {

    private final WebDriver driver;

    public PWPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserName() {
        return driver.findElement(By.id("#profile-name")).getText();
    }

    public GMailPage enterPW(String text) {
        driver.findElement(By.id("#Passwd")).sendKeys(text);
        driver.findElement(By.id("#signIn")).click();
        return new GMailPage(driver);
    }
}
