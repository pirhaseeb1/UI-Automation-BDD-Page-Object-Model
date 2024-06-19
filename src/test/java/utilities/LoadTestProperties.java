package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadTestProperties {

    public static String env = System.getProperty("env");

    public static final String DEFAULT_ENV = "stg";
    public static Properties prop = new Properties();

    static {
        if (env==null){
            env = DEFAULT_ENV;
        }
        try{
            FileInputStream inputStream = new  FileInputStream("src/main/java/configurations/"+env+".properties");
            prop.load(inputStream);
        }catch (IOException idException){
            new RuntimeException("Unable to load properties"+ idException.getCause());
        }
    }

    public static String getProperties(String key) { return (String) prop.get(key); }
    // public static String getBOSProperties(String key) { return (String) prop.get(key); }
}
