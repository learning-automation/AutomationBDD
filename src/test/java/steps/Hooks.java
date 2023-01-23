package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;
import utility.Browser;

public class Hooks extends Browser {
    WebDriver driver;
    Browser browser;

    public Hooks(Browser browser) {
        this.driver = browser.getDriver();
        this.browser = browser;
    }

    @Before // its should work before every scenarios
    public void before() {
        System.out.println("Create browser instance");
        browser.setBrowserName();
        browser.launchBrowser();
    }

    // @BeforeAll // it should work before all scenario only once
    // @BeforeStep // it should work for each step
    // similary after examples

    @After
    public void after(){
        browser.closeBrowser();
    }

}
