package base;

import driver.ThreadLocalDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSteps {
    public ThreadLocalDriver driver;
    protected WebDriverWait wait;

    protected void setupCucumber() {
        System.out.println("Cucumber Base Step");
        //Get driver to use step files
        wait = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 10);
    }

    protected void teardown() {
        ThreadLocalDriver.getTLDriver().getSessionId();
    }
}

