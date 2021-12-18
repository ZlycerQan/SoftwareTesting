
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

class TestCaseTest {
    private WebDriver driver;

    private String baseUrl;

    private boolean acceptNextAlert = true;

    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://cn.bing.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCase() throws Exception {
        driver.get(baseUrl + "/");
        assertEquals("必应", driver.getTitle());
        driver.findElement(By.id("sb_form_q")).clear();
    }

    @AfterEach
    public void testDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!verificationErrorString.equals("")) {
            fail(verificationErrorString);
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}