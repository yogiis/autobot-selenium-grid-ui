package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.ThreadLocalDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GoogleSteps {

    public Hooks hooks;
    ThreadLocalDriver driver;

    public GoogleSteps(Hooks hooks) {
        this.hooks = hooks;
        driver = hooks.driver;
    }

    @Given("^User on page google\\.com$")
    public void userOnPageGoogleCom() {
        System.out.println("On Page Google.com ");
        ThreadLocalDriver.getTLDriver().get("https://www.google.co.id/");
    }

    @When("^User input text \"([^\"]*)\"$")
    public void userInputText(String text) {
        System.out.println("User Input Text On Field Search ");
        WebElement inputText = ThreadLocalDriver.getTLDriver().findElement(By.name("q"));
        WebElement iconSearch = ThreadLocalDriver.getTLDriver().findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
        inputText.sendKeys(text);
        iconSearch.click();
    }

    @Then("^User success searching$")
    public void userSuccessSearching() {
        System.out.println("User Success Searching");
        WebElement pageResult = ThreadLocalDriver.getTLDriver().findElement(By.id("result-stats"));
        boolean pageResultDisplayed = pageResult.isDisplayed();
        Assert.assertTrue(pageResultDisplayed);
    }
}
