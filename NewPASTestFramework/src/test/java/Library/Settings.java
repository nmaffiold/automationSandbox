package Library;

import org.junit.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Settings {
    private InputStream inputStream;

    /* (non-Javadoc)
     * @see com.planittesting.selenium.javaframework.library.SettingsInterface#getConfigValue(java.lang.String)
     */
    public String getConfigValue(String keyIWant) {
        return loadProperties("config.properties").getProperty(keyIWant);
    }

    public String getUserValue(String userVal) {
        return loadProperties("roleList.properties").getProperty(userVal);
    }

    /**
     * Loads a properties file
     *
     * @param file the name (and path) of the file you want to load
     * @return The Properties
     */
    private Properties loadProperties(String file) {
        Properties prop = new Properties();

        inputStream = getClass().getClassLoader().getResourceAsStream(file);
        try {
            prop.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            Assert.fail("Could not find properties file " + e.getMessage());
        }
        return prop;
    }


}

