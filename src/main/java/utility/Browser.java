package utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;
public class Browser {

    private String browserName;
    public static WebDriver driver = null;

    public String getBrowserName() {
        return browserName;
    }
    public void setBrowserName(){
        this.browserName = "chrome";
       // this.browserName = System.getProperty("browser");
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void launchBrowser(){

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("chromeGrid")) {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setBrowserName("chrome");
            String huburl = "http://192.168.1.11:4444/wd/hub";
            try {
                driver = new RemoteWebDriver(new URL(huburl), capabilities);
            }catch(Exception e){
                System.out.println(">>>>>>>>>>>> failed to launch grid" );
                e.printStackTrace();
            }
        } else {
            System.out.println("the driver provided is not avaialable");
        }
        // by default 60 sec implicit wait
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void navigateUrl(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        driver.close();
        driver.quit();

    }

}
