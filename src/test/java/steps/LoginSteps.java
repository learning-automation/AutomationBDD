package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import utility.Browser;
import utility.Constants;

public class LoginSteps {
    LoginPage loginPage;
    WebDriver driver;
    Browser browser;

    public LoginSteps(Browser browser){
        driver = browser.getDriver();
        loginPage = new LoginPage(driver);
        this.browser = browser;
    }

    @Given("^user navigate to application$")
    public void navigateToApplication(){
        browser.navigateUrl((String)Constants.propBrowser.get("url"));
    }

    @When("^user enter the username \"(.*)\"$")
    public void enterUserName(String username){
        loginPage.enterUsername(Constants.currentTCData.getProperty(username));
    }

    @And("^user enter the password \"(.*)\"$")
    public void enterPassword(String password){
           loginPage.enterPassword(Constants.currentTCData.getProperty(password));
    }

    @And("^user clicks on login button$")
    public void clickLogin(){
          loginPage.clickLogIn();
    }

    @Then("^user should be able to see error message as \"(.*)\"$")
    public void validateHomeScreen(String text){
        Assert.assertEquals(loginPage.getErrorElement().getText(), Constants.currentTCData.getProperty(text));
    }
}
