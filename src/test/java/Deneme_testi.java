import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Deneme_testi {
    AndroidDriver<MobileElement> driver;

    @Test
    public void test() throws MalformedURLException {

        DesiredCapabilities Capabilities = new DesiredCapabilities();


        Capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
        Capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        Capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        Capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        Capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\EBRU\\IdeaProjects\\Appium\\Apps\\Calculator_8.4.1 (520193683)_Apkpure.apk");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);





    }
}
