package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.joda.time.Days;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EventStepdefs {
    WebDriver driver;

    @Given("^I navigate to blueskycitadel\\.com$")
    public void iNavigateToBlueskycitadelCom() {
        System.setProperty("webdriver.gecko.driver", "/Users/osekinime/BlueSky/Gecko/geckodriver");

        //STEP 3: Instantiate your firefox driver
        driver = new FirefoxDriver();

        //STEP 4: Navigate to url
        driver.get("http://blueskycitadel.com/");
    }
    @When("^I click on Events$")
    public void iClickOnEvents() {
        driver.findElement(By.linkText("Events")).click();
    }

    @And("^I enter events in$")
    public void iEnterEventsIn() {
        driver.findElement(By.xpath("//*[@id=\"tribe-bar-date\"]")).sendKeys("2020-09-15");
    }

    @And("^I enter keyword$")
    public void iEnterKeyword() {
        driver.findElement(By.xpath("//*[@id=\"tribe-bar-search\"]")).sendKeys("GP Appointment");
    }


    @Then("^I close my window$")
    public void iCloseMyWindow() {
       driver.close();
    }




}
