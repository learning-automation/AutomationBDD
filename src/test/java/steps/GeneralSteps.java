package steps;

import io.cucumber.java.en.And;
import utility.Constants;
import utility.TestDataReader;

public class GeneralSteps {

    @And("^read data for application$")
    public void readURLs(){
        Constants.propBrowser = TestDataReader.readProperties("Browser.properties");
    }

    @And("^read data for testcase \"(.*)\"$")
    public void readDataTestCase(String tc){
        Constants.currentTCData = TestDataReader.readProperties(tc);
    }
}
