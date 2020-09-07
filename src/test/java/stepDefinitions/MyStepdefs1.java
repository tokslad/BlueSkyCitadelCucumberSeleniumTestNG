package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyStepdefs1 {
    WebDriver driver;


    @Given("^I navigate to blueskycitadelform site$")
    //@Given("I navigate to blueskycitadelform site")
    public void i_navigate_to_blueskycitadelform_site()  {
        //STEP 2: set your system path
        System.setProperty("webdriver.gecko.driver", "/Users/osekinime/BlueSky/Gecko/geckodriver");

        //STEP 3: Instantiate your firefox driver
        driver = new FirefoxDriver();

        //STEP 4: Navigate to url
        driver.get("http://blueskycitadel.com/");
    }

    @When("^I click on Automation Testing site$")
    public void iClickOnAutomationTestingSite() {
        driver.findElement(By.linkText("Automation Testing Form")).click();
    }

    @And("^I enter the Signle line text$")
    public void iEnterTheSignleLineText() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-135\"]")).sendKeys("My first enter");
    }

    @And("^I click on select$")
    public void iClickOnSelect() {
        new Select(driver.findElement(By.xpath("//*[@id=\"nf-field-136\"]"))).selectByValue("two");
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-124\"]")).sendKeys("dougdodo@gmail.com");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-144\"]")).sendKeys("Thankyou");
    }

    @And("^I click on multi-select$")
    public void iClickOnMultiSelect() {
        WebElement multiSelect123 = driver.findElement(By.xpath("//*[@id='nf-field-137']"));
        Select multiSelector = new Select(multiSelect123);
        multiSelector.selectByVisibleText("Two");
        multiSelector.selectByVisibleText("Three");
    }

    @And("^I click radio list$")
    public void iClickRadioList() {
        driver.findElement(By.xpath("//*[@id=\"nf-label-class-field-138-1\"]")).click();
    }

    @And("^I click on checkbox list$")
    public void iClickOnCheckboxList() {
        driver.findElement(By.xpath("//*[@id=\"nf-label-field-139-1\"]")).click();
    }

    @And("^I click on country$")
    public void iClickOnCountry() {
        new Select(driver.findElement(By.xpath("//*[@id=\"nf-field-140\"]"))).selectByVisibleText("United Kingdom");
    }


    @And("^I enter date$")
    public void iEnterDate() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-141-wrap\"]/div[2]/div/input[2]")).sendKeys("08/31/2020");
    }


    @And("^I click on single checkbox$")
    public void iClickOnSingleCheckbox() {
        driver.findElement(By.xpath("//*[@id=\"nf-label-field-142\"]")).click();

    }

    @And("^I enter paragraph text$")
    public void iEnterParagraphText() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-143\"]")).sendKeys("I Like Big Butt");
    }

    @And("^I click on submit$")
    public void iClickOnSubmit() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-133\"]")).click();
    }

    @Then("^I close window$")
    public void iCloseWindow() {
        driver.close();
    }
}
