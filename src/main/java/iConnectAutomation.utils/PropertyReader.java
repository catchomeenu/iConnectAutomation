package iConnectAutomation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public synchronized static String readDataFromPropertyFile(String Key) throws FileNotFoundException
    {

       // FileInputStream fs=new FileInputStream("/Users/PriyaJadhawar/priyaworkspace/IConnectAutomationLatest/iConnectAutomation/appconfig.properties");
        FileInputStream fs=new FileInputStream("/Users/bhara/Desktop/Githubtraining/automationproject/iConnectAutomation/appconfig.properties");
        Properties prop = new Properties();
        try {
            prop.load(fs);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String data=prop.getProperty(Key);
        return data;


    }

}
