package NewProject.NewProject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.URL;

public class BaseTest {

    public AndroidDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setDeviceName("Android Device"); // IMPORTANT
        options.setAutomationName("UiAutomator2");
        options.setApp("E:\\apk\\testing.apk");
        options.setAutoGrantPermissions(true);

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"), options
        );
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    @BeforeSuite
    public void startAppium() {
        AppiumService.startServer();
    }

    @AfterSuite
    public void stopAppium() {
        AppiumService.stopServer();
    }
}
