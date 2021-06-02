package base;

import driver.ThreadLocalDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest extends DesiredCapabilities {

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void preparation(String browser) throws Exception {
        if (browser.equals("chrome")) {
            new DesiredCapabilities();
            DesiredCapabilities capability = chrome();
            capability.setBrowserName("chrome");
            capability.setPlatform(Platform.MAC);
            ChromeOptions options = new ChromeOptions();
            options.merge(capability);
            ThreadLocalDriver.setTLDriver(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options));
        } else if (browser.equals("firefox")) {
            new DesiredCapabilities();
            DesiredCapabilities capability = firefox();
            capability.setBrowserName("firefox");
            capability.setPlatform(Platform.MAC);
            FirefoxOptions options = new FirefoxOptions();
            options.merge(capability);
            ThreadLocalDriver.setTLDriver(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options));
        }

        ThreadLocalDriver.getTLDriver().manage().window().maximize();
        ThreadLocalDriver.getTLDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void stopServer() {
        ThreadLocalDriver.getTLDriver().quit();
    }

}
