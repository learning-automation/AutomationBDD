package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class ScreenShot {

    public static void takeScreenShot(String fileName){
        try {
            TakesScreenshot sc = ((TakesScreenshot) Browser.driver);
            File f = sc.getScreenshotAs(OutputType.FILE);
            File f1 = new File(Constants.SSPATH + fileName + ".png");
            FileUtils.copyFile(f, f1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
