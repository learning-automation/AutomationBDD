package utility;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class TestDataReader {
    public static Properties readProperties(String fileName) {
        Properties p = null;
        try{
        FileInputStream fr = new FileInputStream(Constants.PATH + fileName);
        p = new Properties();
        p.load(fr);
        } catch(Exception e){}
        return p;
    }
}
