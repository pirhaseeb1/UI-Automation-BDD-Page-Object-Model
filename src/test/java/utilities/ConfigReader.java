package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties prop;
    public static String browser = System.getProperty("browser");

    /**
     * This method is used to load the properties from config.properties file
     *
     * @return it returns Properties prop object
     */
    public Properties init_prop() {

        prop = new Properties();

            if (browser == null) {
                browser = "headlesschrome";
            }
            try {
                FileInputStream inputStream = new FileInputStream("src/main/java/configurations/" + browser + ".properties");
                prop.load(inputStream);
            } catch (IOException idException) {
                new RuntimeException("Unable to load properties" + idException.getCause());
            }


        return prop;

    }

}
