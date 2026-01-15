package Login;

import NewProject.NewProject.BaseTest;
import io.appium.java_client.AppiumBy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login extends BaseTest {

    WebDriverWait wait;

    @Test
    public void login() throws InterruptedException {

    
       Thread.sleep(5000);
        String source = driver.getPageSource();
        System.out.println(source);

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

       
        WebElement drama = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        AppiumBy.accessibilityId("Drama")
                )
        );
        drama.click();

     
        WebElement elementcheck = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//android.widget.EditText")
                )
        );
        elementcheck.click();
        elementcheck.sendKeys("8920689888");

        // click Send OTP
        WebElement clickonsendotp = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//android.view.View[@content-desc='Send OTP']")
                )
        );
        clickonsendotp.click();

        System.out.println("Application login successful");

        // enter OTP
        WebElement clickonelement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//android.widget.EditText")
                )
        );
        clickonelement.click();
        clickonelement.sendKeys("1234");

        // click Verify OTP
        WebElement clickonverifyotp = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//android.view.View[@content-desc='Verify OTP']")
                )
        );
        clickonverifyotp.click();

        Thread.sleep(5000);

        System.out.println("Application login successfully");
    }
}
