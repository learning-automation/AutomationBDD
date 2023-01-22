package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import utility.Browser;

public class LoginSteps {
    LoginPage loginPage;
    WebDriver driver;

    public LoginSteps(Browser browser){
        driver = browser.getDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("^user navigate to application$")
    public void navigateToApplication(){
                System.out.println("running my test");
    }

    @When("^user enter the username \"(.*)\"$")
    public void enterUserName(String username){
        loginPage.enterUsername(username);
    }

    @And("^user enter the password \"(.*)\"$")
    public void enterPassword(String password){
           loginPage.enterPassword(password);
    }

    @And("^user clicks on login button$")
    public void clickLogin(){
          loginPage.clickLogIn();
    }

    @Then("user should be able to see error message as \"(.*)\"")
    public void validateHomeScreen(String text){
        Assert.assertEquals(loginPage.getErrorElement().getText(), text);
    }
}
