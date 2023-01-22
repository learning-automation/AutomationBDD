package steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utility.Browser;

public class Hooks extends Browser {
    WebDriver driver ;
    Browser browser;

    public Hooks(Browser browser){
        this.driver = browser.getDriver();
        this.browser = browser;
    }

    @Before
    public void before(){
        System.out.println("Create browser instance");
        browser.setBrowserName();
        browser.launchBrowser();
    }

}
