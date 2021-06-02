package driver;

import org.openqa.selenium.remote.RemoteWebDriver;

public class ThreadLocalDriver {
    private static ThreadLocal<RemoteWebDriver> tlDriver = new ThreadLocal<RemoteWebDriver>();

    public static RemoteWebDriver getTLDriver() {
        return tlDriver.get();
    }

    public static void setTLDriver(RemoteWebDriver driver) {
        tlDriver.set(driver);
    }
}