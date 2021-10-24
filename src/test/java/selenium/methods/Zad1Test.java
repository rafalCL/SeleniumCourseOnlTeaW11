package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Zad1Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://hotel-testlab.coderslab.pl/en/login?back=my-account");
        WebElement element = driver.findElement(By.id("email_create"));
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        element.sendKeys(randomEmail);
        element.submit();
        WebElement checkboxMale = driver.findElement(By.id("id_gender1"));
//        List<WebElement> someCheckboxes = driver.findElements(By.cssSelector(".classAppliedToCheckboxes"));
//        someCheckboxes.get(0).click();
        checkboxMale.click();

//        driver.quit();
    }
}
