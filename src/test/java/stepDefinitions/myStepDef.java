package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class myStepDef {

    WebDriver driver;

    @Given("^I navigate to web page$")
    public void iNavigateToTheWebPage() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\luis_\\Downloads\\chromedrive_32\\cromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa-automation-challenge.github.io/sandbox/");

    }

    @And("^I click Type drop down$")
    public void iClickTypeDropDown() {
        driver.findElement(By.xpath("//*[@id=\"type\"]")).click();

    }

    @And("^I click Special$")
    public void iClickSpecial() {
        driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]")).click();
    }

        @And("^I click Support Plan drop down$")
        public void iClickSupportPlanDropDown() {
            driver.findElement(By.xpath("//*[@id=\"support\"]")).click();
        }

        @And("^I click Full$")
        public void iClickFull() {
            driver.findElement(By.xpath("//*[@id=\"support\"]/option[3]")).click();
        }

        @And("^I click Monthly duration$")
        public void iClickMonthlyDuration() {
            driver.findElement(By.xpath("//*[@id=\"duration\"]")).click();
        }

        @And("^I enter (\\d+)$")
        public void iEnter (Integer arg0) {
        }

        @And("^I click calculate$")
        public void iClickCalculate() {
            driver.findElement(By.xpath("//*[@id=\"calculate\"]")).click();
        }
        @Then("^summary should be displayed$")
            public void summaryShouldBeDisplayed() {
        }
}