import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    private WebDriver webDriver;

    @Before
    public void configTest() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void test() {
        webDriver.navigate().to("https://www.google.com/");

        WebElement webElement = webDriver.findElement(By.xpath("//input[@name='q']"));
        webElement.sendKeys("yandex");
    }

}
