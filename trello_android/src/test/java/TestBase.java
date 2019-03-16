import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName","Nexus");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","8.1");
        capabilities.setCapability("appPackage","com.trello");
        capabilities.setCapability("appActivity",".home.HomeActivity");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("app","C:\\Users\\Vital\\Documents\\GitHub\\Blazhko_mobile_java\\trello_android\\com.trello.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
