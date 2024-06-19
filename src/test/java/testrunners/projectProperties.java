package testrunners;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class projectProperties {
    private static final String ENV_FILE_PATH = ".env";
    private static Properties properties = new Properties();
    static {
        try {
            FileInputStream fileInputStream = new FileInputStream(ENV_FILE_PATH);
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}