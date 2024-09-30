package iConnectAutomation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public synchronized static String readDataFromPropertyFile(String Key) throws FileNotFoundException
    {

        FileInputStream fs=new FileInputStream("C://Users//ramya//IdeaProjects//Ramya_Infyni_iConnectAutomation//appconfig.properties");
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
