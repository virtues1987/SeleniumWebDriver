import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GMailPage {
    private final WebDriver driver;

    public GMailPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEMailFromList() {
        return driver.findElement(By.xpath("//*[@id=\":3t\"]/b")).getText();
    }
}
