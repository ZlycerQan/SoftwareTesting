import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cn.bing.com");
        System.out.println("Home Page title: " + driver.getTitle());
        WebElement element = driver.findElement(By.id("sb_form_q"));
        element.sendKeys("软件测试");
        element.submit();
        (new WebDriverWait(driver, 2)).until((ExpectedCondition<Boolean>) d -> d.getTitle().toLowerCase().startsWith("软件测试"));
        System.out.println("Result Page title: " + driver.getTitle());
        driver.quit();
    }
}
